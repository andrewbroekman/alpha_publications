/** PublicationTypeStateTest Class
* @author Elizabeth Bode
 * @author Gian Paolo Buffo
* @version 1.0
* @since 2016-03-23
*/

package com.codinginfinity.research.publications;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.*;

public class PublicationTypeStateTest {
    
    private TestPublicationTypeState testState;
    
    @Before
    public void preTestInitialization() {
        try
        {
            Date testDate = new Date();
            testState = new TestPublicationTypeState(testDate);
        }
        catch (Throwable ex)
        {
            fail("Contsructor claimed exception when no error occurred.");
        }
    }
    
    @After
    public void postTestCleanup() {
    }
    
    /**
     * Test of setAccreditationPoints method
     */
    @Test
    public void testSetEffectiveDate() {
        System.out.println("setEffectiveDate");
        Date testDate = new Date();
        TestPublicationTypeState instance = new TestPublicationTypeState();
        instance.setEffectiveDate(testDate);
        assertEquals(testDate, instance.effectiveDate);
    }

    /**
     * Test of getAccreditationPoints method
     */
    @Test
    public void testGetEffectiveDate() {
        System.out.println("getEffectiveDate");
        Date expResult = new Date();
        TestPublicationTypeState instance = new TestPublicationTypeState(expResult);
        Date result = instance.getEffectiveDate();
        assertEquals(expResult, result);
    }

    public class TestPublicationTypeState {
        private Date effectiveDate;

        /**
        * Class constructor
        */
        public TestPublicationTypeState()
        {
            effectiveDate = null;
        }
        /**
        * Class constructor
        */
        public TestPublicationTypeState(Date effDate)
        {
            effectiveDate = effDate;
        }
        
        /**
        * Setter for the effectiveDate variable
        * @param date
        *         The variable that will be used to change the value of the effectiveDate variable
        */
        public void setEffectiveDate(Date date)
        {
            effectiveDate = date;
        }

        /**
        * Getter for effectiveDate
        * @return The effective date
        */
        public Date getEffectiveDate()
        {
            return effectiveDate;
        }
    }
}
