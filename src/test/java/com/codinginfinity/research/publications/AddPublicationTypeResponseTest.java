/** AddPublicationTypeResponseTest Class
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

public class AddPublicationTypeResponseTest {
    
    private List<PublicationType> testPubType;
    private List<TestAddPublicationTypeResponse> testResponse;
    
    @Before
    public void preTestInitialization() {
        try
        {
            testPubType = new LinkedList<PublicationType>();
            testPubType.add(new PublicationType("testName", "testDescription"));
            testPubType.add(new PublicationType("testName", ""));
            testPubType.add(new PublicationType("", "testDescription"));
            testPubType.add(new PublicationType("", ""));
            testResponse = new LinkedList<TestAddPublicationTypeResponse>();
            for (int i = 0; i < testResponse.size(); i++)
            {
                testResponse.add(new TestAddPublicationTypeResponse(testPubType.get(i)));
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
    public void testSetAddPublicationTypeResponse() {
        System.out.println("setAddPublicationTypeResponse");
        TestAddPublicationTypeResponse instance = new TestAddPublicationTypeResponse();
        PublicationType testPubType = new PublicationType("testName", "testDescription");
        instance.setAddPublicationTypeResponse(testPubType);
        assertEquals(testPubType, instance.newPubType);
    }

    /**
     * Test of getPublicationTypeResponse method
     */
    @Test
    public void testGetAddPublicationTypeResponse() {
        System.out.println("getAddPublicationTypeResponse");
        PublicationType expPubType = new PublicationType("testName", "testDescription");
        TestAddPublicationTypeResponse instance = new TestAddPublicationTypeResponse(expPubType);        
        PublicationType result = instance.getAddPublicationTypeResponse();
        assertEquals(expPubType, result);
    }
    
    public class TestAddPublicationTypeResponse {
        private PublicationType newPubType;

        /**
         * Class constructor
         */
        public TestAddPublicationTypeResponse()
        {
            newPubType = null;
        }
      
        public TestAddPublicationTypeResponse(PublicationType pt)
        {
            newPubType = pt;
        }
        
        /**
        * Setter for the newPubType variable
        * @param pt
        *         The variable that will be used to change the value of the newPubType variable
        */
        public void setAddPublicationTypeResponse(PublicationType pt)
        {
            newPubType = pt;
        }

        /**
        * Getter for newPubType
        * @param PublicationType
        *           Returns the new publication type
        * @return The new publication type
        */
        public PublicationType getAddPublicationTypeResponse()
        {
            return newPubType;
        }
    }
}
