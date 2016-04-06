/** PublicationTypesTest Class
* @author Elizabeth Bode
* @version 1.0
* @since 2016-03-23
*/

package com.codinginfinity.publications;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PublicationTypesTest {
    @Before
    public void preTestInitialization() {
    }
    
    @After
    public void postTestCleanup() {
    }

    /**
     * Test of isAdmin method
     */
    @Test
    public void testIsAdmin() {
        System.out.println("isAdmin");
        Date effDate = new Date("", 0, 0);
        Real accPoints = new Real(0);
        TestPublicationTypes instance = new TestPublicationTypes("", "", effDate,accPoints, "");
        boolean expResult = true;
        boolean result = instance.isAdmin();
        assertEquals(expResult, result);
    }

    /**
     * Test of persistObject method
     */
    @Test
    public void testPersistObject() {
        System.out.println("persistObject");
        Date effDate = new Date("", 0, 0);
        Real accPoints = new Real(0);
        PublicationType pt = new PublicationType("testName", "testDescr");
        TestPublicationTypes instance = new TestPublicationTypes(pt.name, pt.description, effDate, accPoints, "testReason");
        instance.persistObject(pt);
    }

    /**
     * Test of modifyPublicationType method
     */
    @Test
    public void testModifyPublicationType() {
        System.out.println("modifyPublicationType");
        Date effDate = new Date("", 0, 0);
        Real accPoints = new Real(0);
        PublicationType pt = new PublicationType("testName", "testDescr");
        ModifyPublicationTypeRequest modifyPublicationTypeRequest = new ModifyPublicationTypeRequest(pt);
        TestPublicationTypes instance = new TestPublicationTypes(pt.name, pt.description, effDate, accPoints, "testReason");
        ModifyPublicationTypeResponse expResult = new ModifyPublicationTypeResponse(modifyPublicationTypeRequest.getModifiedPublicationType());
        ModifyPublicationTypeResponse result = instance.modifyPublicationType(modifyPublicationTypeRequest);
        assertEquals(expResult, result);
    }

    /**
     * Test of addPublicationType method
     */
    @Test
    public void testAddPublicationType() {
        System.out.println("addPublicationType");
        Date effDate = new Date("", 0, 0);
        Real accPoints = new Real(0);
        PublicationType pt = new PublicationType("testName", "testDescr");
        AddPublicationTypeRequest addPublicationTypeRequest = new AddPublicationTypeRequest(pt);
        TestPublicationTypes instance = new TestPublicationTypes(pt.name, pt.description, effDate, accPoints, "testReason");
        AddPublicationTypeResponse expResult = new AddPublicationTypeResponse(addPublicationTypeRequest.getNewPublicationType());
        AddPublicationTypeResponse result = instance.addPublicationType(addPublicationTypeRequest);
        assertEquals(expResult, result);
    }
    
    public class TestPublicationTypes {
        String nameInput;
        String descrInput;
        Date effDateInput;
        Real accPointsInput;
        String reason;

        /**
        * Class constructor
        */
        public TestPublicationTypes(String inName, String inDescr, Date inEffDate, Real inPoints, String inReason) {
            nameInput = inName;
            descrInput = inDescr;
            effDateInput = inEffDate;
            accPointsInput = inPoints;
            reason = inReason;
        }

        /**
         * Tests if the user of the request has administrator rights
         * @param boolean
         *                The function will return whether this function succeeded or not
         * @return
         *         true if the user is an administrator
         *         false if the user is not an administrator
         */
        public boolean isAdmin()
        {
            return true;
        }

        /**
         * Stores the new/modified publication type
         * @param pt
         *           The publication type to be stored
         */
        public void persistObject(PublicationType pt)
        {

        }

        /**
        * Handles the modify publication request and response in order for a new publication type to be successfully updated
        * @param modifyPublicationTypeRequest
        *         Contains the necessary data and functions that need to be carried out in order to modify the publication type
        * @return An instance of ModifyPublicationTypeResponse is returned which contains the result of the associated request
        */
        public ModifyPublicationTypeResponse modifyPublicationType(ModifyPublicationTypeRequest modifyPublicationTypeRequest) {
            try
            {
                if (isAdmin())
                {
                    modifyPublicationTypeRequest.setModifiedPublicationType(nameInput, descrInput);
                    modifyPublicationTypeRequest.addStateEntry(effDateInput, accPointsInput, reason);
                    persistObject(modifyPublicationTypeRequest.getModifiedPublicationType());
                    return new ModifyPublicationTypeResponse(modifyPublicationTypeRequest.getModifiedPublicationType());
                }
                else
                    throw new AuthorizationException("Error with modification authorization! User does not have administrator rights in order to modify a publication type.");
            }
            catch (AuthorizationException err)
            {
                System.out.println(err.getReason());
            }
            return null;
        }

        /**
        * Handles the add publication request and response in order for a new publication type to be successfully added
        * @param addPublicationTypeRequest
        *         Contains the necessary data and functions that need to be carried out in order to add the publication type
        * @return An instance of AddPublicationTypeResponse is returned which contains the result of the associated request
        */
        public AddPublicationTypeResponse addPublicationType(AddPublicationTypeRequest addPublicationTypeRequest)
        {
            try
            {
                if (isAdmin())
                {
                    addPublicationTypeRequest.createPublicationType(nameInput, descrInput);
                    addPublicationTypeRequest.addStateEntry(effDateInput, accPointsInput, reason);
                    persistObject(addPublicationTypeRequest.getNewPublicationType());
                    return new AddPublicationTypeResponse(addPublicationTypeRequest.getNewPublicationType());
                }
                else
                    throw new AuthorizationException("Error with creation authorization! User does not have administrator rights in order to create a new publication type.");
            }
            catch (AuthorizationException err)
            {
                System.out.println(err.getReason());
            }
            return null;
        }  

    }
}
