/** ModifyPublicationTypeResponseTest Class
* @author Elizabeth Bode
* @version 1.0
* @since 2016-03-23
*/

package com.codinginfinity.research.publications;

import java.util.LinkedList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ModifyPublicationTypeResponseTest {
    private List<PublicationType> testPubType;
    private List<TestModifyPublicationTypeResponse> testResponse;
    
    @Before
    public void preTestInitialization() {
        try
        {
            testPubType = new LinkedList<PublicationType>();
            testPubType.add(new PublicationType("testName", "testDescription"));
            testPubType.add(new PublicationType("testName", ""));
            testPubType.add(new PublicationType("", "testDescription"));
            testPubType.add(new PublicationType("", ""));
            testResponse = new LinkedList<TestModifyPublicationTypeResponse>();
            for (int i = 0; i < testResponse.size(); i++)
            {
                testResponse.add(new TestModifyPublicationTypeResponse(testPubType.get(i)));
            }
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
     * Test of setPublicationTypeResponse method
     */
    @Test
    public void testSetModifyPublicationTypeResponse() {
        System.out.println("setModifyPublicationTypeResponse");
        TestModifyPublicationTypeResponse instance = new TestModifyPublicationTypeResponse();
        PublicationType testPubType = new PublicationType("testName", "testDescription");
        instance.setModifyPublicationTypeResponse(testPubType);
        assertEquals(testPubType, instance.newPubType);
    }

    /**
     * Test of getPublicationTypeResponse method
     */
    @Test
    public void testGetModifyPublicationTypeResponse() {
        System.out.println("getModifyPublicationTypeResponse");
        PublicationType expPubType = new PublicationType("testName", "testDescription");
        TestModifyPublicationTypeResponse instance = new TestModifyPublicationTypeResponse(expPubType);        
        PublicationType result = instance.getModifyPublicationTypeResponse();
        assertEquals(expPubType, result);
    }
    
    public class TestModifyPublicationTypeResponse {
        private PublicationType newPubType;

        /**
        * Class constructor
        */
        public TestModifyPublicationTypeResponse()
        {
            newPubType = null;
        }
        
        public TestModifyPublicationTypeResponse(PublicationType pt)
        {
            newPubType = pt;
        }
        
        /**
        * Setter for the newPubType variable
        * @param pt
        *         The variable that will be used to change the value of the newPubType variable
        */
        public void setModifyPublicationTypeResponse(PublicationType pt)
        {
            newPubType = pt;
        }

        /**
        * Getter for newPubType
        * @param PublicationType
        *           Returns the new publication type
        * @return The new publication type
        */
        public PublicationType getModifyPublicationTypeResponse()
        {
            return newPubType;
        }
    }
}
