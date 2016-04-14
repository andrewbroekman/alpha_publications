/** NotActiveTest Class
* @author Elizabeth Bode
* @version 1.0
* @since 2016-03-23
*/

package com.codinginfinity.research.publications;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;

public class NotActiveTest {
    private TestNotActive testNotActive;
    
    @Before
    public void preTestInitialization() {
        try
        {
            Date testDate = new Date();
            testNotActive = new TestNotActive(testDate, "testDeactReason");
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
     * Test of getDeactivationReason method
     */
    @Test
    public void testGetDeactivationReason() {
        System.out.println("getDeactivationReason");
        String expResult = "testDeactReason";
        String result = testNotActive.getDeactivationReason();
        assertEquals(expResult, result);
    }
    
    public class TestNotActive extends PublicationTypeState{
        String deactivationReason;

        /**
        * Class constructor
        */
        public TestNotActive()
        {
            super();
            deactivationReason = "";
        }

        /**
        * Class constructor
        */
        public TestNotActive(Date effDate, String reason)
        {
            super(effDate);
            deactivationReason = reason;
        }

        /**
        * Setter for the deactivationReason variable
        * @param reason
        *         The variable that will be used to change the value of the deactivationReason variable
        */
        /*public void setDeactivationReason(String reason)
        {
            deactivationReason = reason;
        }*/

        /**
        * Getter for deactivationReason
        * @param String
        *           Returns the deactivation reason
        * @return The deactivationReason as a string
        */
        public String getDeactivationReason()
        {
            return deactivationReason;
        }
    }
}
