/** ModifyPublicationTypeResponseTest Class
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
    
    public class TestModifyPublicationTypeResponse {
        PublicationType newPubType;

        /**
        * Class constructor
        */
        public TestModifyPublicationTypeResponse(PublicationType pt)
        {
            newPubType = pt;
        }
    }
}
