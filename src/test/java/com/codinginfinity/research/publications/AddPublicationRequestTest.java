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

public class AddPublicationRequestTest {
    AddPublicationRequest testAddPubNull;
    AddPublicationRequest testAddPubVal;

    @Before
    public void preTestInitialization(){
        try {
            testAddPubNull = new AddPublicationRequest();
            testAddPubVal = new AddPublicationRequest(new PublicationState());
        }catch(Throwable ex){
            fail("Constructor claimed exception when no error occurred");
        }
    }

    @After
    public void postTestCleanup(){
        testAddPubVal = null;
        testAddPubNull = null;
    }

    @Test
    public void testSetInitialState(){
        System.out.println("Create a new state and test the set method");
        PublicationState ps1 = new PublicationState();
        testAddPubVal.setInitialState(ps1);
        assertEquals(ps1, testAddPubVal.getInitialState());
    }

    @Test
    public void testGetInitialState(){
        System.out.println("Testing the get method");
        PublicationState ret = testAddPubNull.getInitialState();
        assertEquals(ret, null);
    }
}
