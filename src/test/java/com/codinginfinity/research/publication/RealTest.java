/** RealTest Class
* @author Elizabeth Bode
* @version 1.0
* @since 2016-03-23
*/

package com.codinginfinity.publications;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RealTest {
    @Before
    public void preTestInitialization() {
    }
    
    @After
    public void postTestCleanup() {
    }

    /**
     * Test of setPoints method
     */
    /*@Test
    public void testSetPoints() {
        System.out.println("setPoints");
        int points = 0;
        Real instance = new Real();
        instance.setPoints(points);        
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of getPoints method
     */
    /*@Test
    public void testGetPoints() {
        System.out.println("getPoints");
        Real instance = new Real();
        int expResult = 0;
        int result = instance.getPoints();
        assertEquals(expResult, result);        
        //fail("The test case is a prototype.");
    }*/
    public class TestReal {
        int accreditPoints;

        /**
        * Class constructor
        */
        public TestReal()
        {
            accreditPoints = 0;
        }

        public TestReal(int points)
        {
            accreditPoints = points;
        }

        /**
        * Setter for the accreditPoints variable
        * @param points
        *         The variable that will be used to change the value of the accreditPoints variable
        */
        public void setPoints(int points)
        {
            accreditPoints = points;
        }

        /**
        * Getter for accreditPoints
        * @param int
        *           Returns the accrediatation points
        * @return The accreditation points
        */
        public int getPoints()
        {
            return accreditPoints;
        }
    }
}
