/** ExceptionTest Class
* @author Elizabeth Bode
* @version 1.0
* @since 2016-03-23
*/

package com.codinginfinity.research.publications;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ExceptionTest {
    
    private TestException testEx;
    
    @Before
    public void preTestInitialization() {
        try
        {
            testEx = new TestException("testReason");
        }
        catch (Throwable ex)
        {
            fail("Constructor claimed exception when no error occurred.");
        }
    }
    
    @After
    public void postTestCleanup() {
    }

    /**
     * Test of setReason method
     */
    @Test
    public void testSetReason() {
        System.out.println("setReason");
        String reason = "changedReason";
        testEx.setReason(reason);
        assertEquals(reason, testEx.getReason());
    }

    /**
     * Test of getReason method
     */
    @Test
    public void testGetReason() {
        System.out.println("getReason");
        String expResult = "testReason";
        String result = testEx.getReason();
        assertEquals(expResult, result);
    }
    
    public class TestException extends Throwable{
    	private String reason;
    	 
    	public TestException(String reason){
    		this.setReason(reason);
    	}
    	
    	protected void setReason(String reason){
    		this.reason = reason;
    	}
    	
    	public String getReason(){
    		return reason;
    	}
    }
}
