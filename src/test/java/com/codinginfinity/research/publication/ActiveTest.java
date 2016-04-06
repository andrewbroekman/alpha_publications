/** ActiveTest Class
* @author Elizabeth Bode
* @version 1.0
* @since 2016-03-23
*/

package com.codinginfinity.publications;

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ActiveTest {
    
    private TestActive testActive;
    
    @Before
    public void preTestInitialization() {
        try
        {
            Date testDate = new Date("October", 2016, 15);
            Real testReal = new Real(15);
            testActive = new TestActive(testDate, testReal);
        }
        catch (NullPointerException ex)
        {
            fail("Contsructor claimed null pointer encounter when it didn't.");
        }
    }
    
    @After
    public void postTestCleanup() {
    }

    /**
     * Test of setAccreditationPoints method
     */
    @Test
    public void testSetAccreditationPoints() {
        System.out.println("setAccreditationPoints");
        int points = 15;
        Active instance = new Active();
        instance.setAccreditationPoints(points);
        assertEquals(points, instance.getAccreditationPoints());
    }

    /**
     * Test of getAccreditationPoints method
     */
    @Test
    public void testGetAccreditationPoints() {
        System.out.println("getAccreditationPoints");
        Active instance = new Active();
        int expResult = 15;
        int result = instance.getAccreditationPoints();
        assertEquals(expResult, result);
    }
    
    public class TestActive extends PublicationTypeState{
        Real accreditationPoints;

        /**
        * Class constructor
        */
        public TestActive()
        {
            super();
            accreditationPoints = null;
        }

        /**
        * Class constructor
        */
        public TestActive(Date inDate, Real inPoints)
        {
            super(inDate);
            accreditationPoints = inPoints;
        }

        /**
        * Setter for the accreditationPoints variable
        * @param point
        *         The variable that will be used to change the value of the accreditationPoints variable
        */
        public void setAccreditationPoints(int points)
        {
            accreditationPoints.setPoints(points);
        }

        /**
        * Getter for accreditationPoints
        * @param int
        *           Returns the total accreditation points
        * @return The total accreditation points
        */
        public int getAccreditationPoints()
        {
            return accreditationPoints.getPoints();
        }
    }
}
