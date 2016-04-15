/** PublicationTypeTest Class
* @author Elizabeth Bode
* @version 1.0
* @since 2016-03-23
*/

package com.codinginfinity.research.publications;

import java.util.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PublicationTypeTest {
    private List<TestPublicationType> testPubType;
    
    @Before
    public void preTestInitialization() {
        try
        {
            testPubType = new LinkedList<TestPublicationType>();
            testPubType.add(new TestPublicationType("testName", "testDescription"));
            testPubType.add(new TestPublicationType("testName", ""));
            testPubType.add(new TestPublicationType("", "testDescription"));
            testPubType.add(new TestPublicationType("", ""));
            
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
     * Test of getPublicationTypesList method
     */
    @Test
    public void testGetPublicationTypesList() {
        System.out.println("getPublicationTypesList");
        TestPublicationType instance = new TestPublicationType();
        Vector expResult = new Vector();
        Vector result = instance.getPublicationTypesList();
        assertEquals(expResult, result);
    }
    
    public class TestPublicationType {
        private String name;
        private String description;
        private PublicationTypeState state;

        /**
        * Class constructor
        */
        public TestPublicationType()
        {
            name = "";
            description = "";
        }

        public TestPublicationType(String name, String description)
        {
            this.name = name;
            this.description = description;
        }

        /**
         * Getter for the list of publication types stored in the database
         * @param Vector
         *                The function will return the list as a vector
         * @return The list of publication types stored in the database
         */
        public Vector getPublicationTypesList()
        {
            return new Vector();
        }
        /**
        * Setter for the type variable using the ModifyPublicationTypeResponse instance          
        */
        /*public void setModifiedType()
        {
            type = modPubTypeResp.sendModifiedPublicationType().type;
        }*/
    }
}
