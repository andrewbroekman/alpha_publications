/** InvalidInputExceptionTest Class
* @author Elizabeth Bode
* @version 1.0
* @since 2016-03-23
*/

package com.codinginfinity.research.publications;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class InvalidInputExceptionTest {
    
    private TestInvalidInputException testInputEx;
    
    @Before
    public void preTestInitialization() {
        try
        {
            testInputEx = new TestInvalidInputException("testReason");
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
     * Test of getReason method
     */
    @Test
    public void testGetReason() {
        System.out.println("getReason");
        String expResult = "testReason";
        String result = testInputEx.getReason();
        assertEquals(expResult, result);
    }

    /**
     * Test of setReason method
     */
    @Test
    public void testSetReason() {
        System.out.println("setReason");
        String reason = "changedReason";
        testInputEx.setReason(reason);
    }
    
    public class TestInvalidInputException extends Exception{
        /**
        * Class constructor
        */
        public TestInvalidInputException(String reason)
        {
            super(reason);
        }

        /**
         * Getter for the invalid input reason
         * @return The reason as a string
         */
        public String getReason()
        {
            return super.getReason();
        }

        /**
         * Setter for the invalid input reason
         * @param reason
         *                The reason coming in used to set the reason in the parent class
         */
        public void setReason(String reason)
        {
            super.setReason(reason);
        }
    }
}
