/** AddPublicationTypeResponseTest Class
* @author Elizabeth Bode
* @version 1.0
* @since 2016-03-23
*/

package com.codinginfinity.publications;

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
    
    public class TestAddPublicationTypeResponse {
        PublicationType newPubType;

        /**
         * Class constructor
         */
        public TestAddPublicationTypeResponse(PublicationType pt)
        {
            newPubType = pt;
        }
    }
}
