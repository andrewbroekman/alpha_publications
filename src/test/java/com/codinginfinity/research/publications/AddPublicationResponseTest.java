/** AddPublicationRequestTest Class
 * @author Christiaan Saaiman
 * @version 1.0
 * @since 2016-04-14
 */

package com.codinginfinity.research.publications;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class AddPublicationResponseTest {
    AddPublicationResponse addPubReqNull;
    AddPublicationResponse addPubReqVal;

    @Before
    public void preTestInitialization(){
        try{
            addPubReqNull = new AddPublicationResponse();
            addPubReqVal = new AddPublicationResponse(new Publication());
        }catch(Throwable ex){
            fail("Constructor claimed exception when no error occurred");
        }
    }

    @After
    public void postTestCleanup(){
        addPubReqVal = null;
        addPubReqNull = null;
    }

    @Test
    public void testSetAddedPublication(){
        System.out.println("Create a new publication and test the set method");
        Publication p1 = new Publication();
        addPubReqVal.setAddedPublication(p1);
        assertEquals(p1, addPubReqVal.getAddedPublication());
    }

    @Test
    public void testGetAddedPublication(){
        System.out.println("Testing the get method");
        assertEquals(null, addPubReqNull.getAddedPublication());
    }
}
