/** AddPublicationTypeRequestTest Class
* @author Elizabeth Bode
* @author Gian Paolo Buffo
* @version 1.1
* @since 2016-03-23
*/

package com.codinginfinity.research.publications;

import java.util.LinkedList;
import java.util.List;
import java.util.Date;
import java.util.Vector;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AddPublicationTypeRequestTest {
    
    private List<PublicationType> testPubType;
    private List<TestAddPublicationTypeRequest> testRequest;
    
    @Before
    public void preTestInitialization() {
        try
        {
            testPubType = new LinkedList<PublicationType>();
            testPubType.add(new PublicationType("testName", "testDescription"));
            testPubType.add(new PublicationType("testName", ""));
            testPubType.add(new PublicationType("", "testDescription"));
            testPubType.add(new PublicationType("", ""));
            testRequest = new LinkedList<TestAddPublicationTypeRequest>();
            for (int i = 0; i < testRequest.size(); i++)
            {
                testRequest.add(new TestAddPublicationTypeRequest(testPubType.get(i)));
            }
            
        }
        catch (NullPointerException ex)
        {
            fail("Constructor claimed publication type parameter is null, but it is not.");
        }
    }
    
    
    @After
    public void postTestCleanup() {
        testRequest.clear();
        testPubType.clear();        
    }
    
    /**
     * Test of verifyDuplicate method
     */
    @Test
    public void testVerifyAddDuplicate() {
        System.out.println("verifyAddDuplicate");
        boolean expResult = false;
        boolean result;
        for (int i = 0; i < testRequest.size(); i++)
        {
            result = testRequest.get(i).verifyAddDuplicate(testRequest.get(i).pubType.name);
            assertEquals(expResult, result);
        }
    }

    /**
     * Test of verifyValidInput method
     */
    @Test
    public void testVerifyAddValidInput_3args() {
        System.out.println("verifyAddValidInput");
        Date inDate = new Date();
        Real inPoints = new Real(10);
        String inReason = "testReason";
        boolean expResult = false;
        boolean result;
        for (int i = 0; i < testRequest.size(); i++)
        {
            result = testRequest.get(i).verifyAddValidInput(inDate, inPoints, inReason);
            assertEquals(expResult, result);
        }
    }

    /**
     * Test of verifyValidInput method
     */
    @Test
    public void testVerifyAddValidInput_String_String() {
        System.out.println("verifyValidInput");
        String name = "testName";
        String description = "testDescription";
        PublicationType testPubType = new PublicationType("testName", "testDescription");
        TestAddPublicationTypeRequest testRequest = new TestAddPublicationTypeRequest(testPubType);
        boolean expResult = true;
        boolean result = testRequest.verifyAddValidInput(name, description);
        assertEquals(expResult, result);
    }

    /**
     * Test of addStateEntry method
     */
    @Test
    public void testAddStateEntryForNewType() {
        System.out.println("addStateEntry");
        Date effDate = new Date();
        Real accPoints = new Real(10);
        String reason = "testReason";
        //Active testActive = new Active(effDate, accPoints);
        //NotActive testNotActive = new NotActive(effDate, reason);
        PublicationType testPubType = new PublicationType("testName", "testDescr");
        TestAddPublicationTypeRequest instance = new TestAddPublicationTypeRequest(testPubType);
        instance.addStateEntryForNewType(effDate, accPoints, reason);
        assertEquals(effDate, instance.pubType.state.getEffectiveDate());
        //assertEquals(testActive, instance.pubType.state);
        //assertEquals(reason, instance.pubType.state.deactivationReason.getDeactivationReason());
    }

    /**
     * Test of createPublicationType method
     */
    @Test
    public void testCreatePublicationType() {
        try
        {
            System.out.println("createPublicationType");
            String name = "testName2";
            String description = "testDescr2";
            PublicationType testPubType = new PublicationType("testName", "testDescr");
            TestAddPublicationTypeRequest instance = new TestAddPublicationTypeRequest(testPubType);
            instance.createPublicationType(name, description);
            assertEquals(name, instance.pubType.name);
            assertEquals(description, instance.pubType.description);
        }
        catch (Throwable ex)
        {
            fail("createPublicationType claimed there was an error when there shouldn't have been.");
        }
    }

    /**
     * Test of getNewPublicationType method
     */
    @Test
    public void testGetNewPublicationType() {
        System.out.println("getNewPublicationType");
        PublicationType expResult = new PublicationType("testName", "testDescr");
        TestAddPublicationTypeRequest instance = new TestAddPublicationTypeRequest(expResult);
        assertEquals(expResult, instance.getNewPublicationType());
    }
    
    public class TestAddPublicationTypeRequest {
        private PublicationType pubType;
        private Vector pubTypeList;

        /**
         * Class constructor
         */
        public TestAddPublicationTypeRequest(PublicationType pt)
        {
            pubType = pt;
            pubTypeList = pubType.getPublicationTypesList();            
        }

        /**
         * Verifies that the publication type doesn't already exist according to publication type name
         * @param name
         *            The name of the new publication type used as a comparison
         * @return 
         *         true if a publication type with that name doesn't exist
         *         false if a publication type with that name already exists
         */
        public boolean verifyAddDuplicate(String name)
        {
            for (int i = 0; i < pubTypeList.size(); i++)
            {
                if (name == pubTypeList.get(i))//.name
                    return false;
            }
            return true;
        }

        /**
         * Verifies that none of the parameters are empty, that they are the right format and that the date isn't in the past
         * @param inDate
         *            The effective date that was input
         * @param inPoints
         *            The accreditation points for the type that was input
         * @param inReason
         *            The reason for deactivation that was input, can be null
         * @return 
         *         true if all the parameters are valid
         *         false if one or more of the parameters are invalid
         */
        public boolean verifyAddValidInput(Date inDate, Real inPoints, String inReason)
        {
            String date = new Date().toString();
            //NumberUtils.isNumber(inPoints.accreditPoints) needs to test accreditPoints are a number and (inDate.getDate() == date) the date isn't in the past
            return (inReason != "");
        }

        /**
         * Verifies that none of the parameters are empty
         * @param name
         *            The name of the new publication type
         * @param description
         *            The description of the new publication type
         * @return 
         *         true if all the parameters are valid
         *         false if one or more of the parameters are invalid
         */
        public boolean verifyAddValidInput(String name, String description)
        {
            return name != "" && description != null;
        }

        /**
         * Creates a new state entry for the new publication type
         * @param effDate
         *            The effective date to be used to create the state
         * @param accPoints
         *            The accreditation points to be used to create the state
         * @param reason
         *            The deactivation reason to be used to create the state
         */
        public void addStateEntryForNewType(Date effDate, Real accPoints, String reason)
        {
            try
            {
                if (verifyAddValidInput(effDate, accPoints, reason))
                {
                    if (accPoints != null)
                    {
                        pubType.state = new Active(effDate, accPoints);                
                    }
                    else
                    {
                        pubType.state = new NotActive(effDate, reason);
                    }
                }
                else
                    throw new InvalidInputException("Error with creating state entry! Effective date, accreditation points or deactivation reason have incorrect input. Please try again.");
            }
            catch (InvalidInputException err)
            {
                System.out.println(err.getReason());
            }
        }

        /**
         * Creates a new publication type
         * @param name
         *         The name of the new publication type
         * @param description
         *         The description of the new publication type
         */
        public void createPublicationType(String name, String description)
        {
            try
            {
                if (verifyAddDuplicate(name))
                {
                    try
                    {
                        if (verifyAddValidInput(name, description))
                        {
                            pubType.name = name;
                            pubType.description = description;
                        }
                        else
                            throw new InvalidInputException("Error with creating! Publication type's name or description have incorrect input. Please try again.");
                    }
                    catch(InvalidInputException err)
                    {
                        System.out.println(err.getReason());
                    }

                }
                else
                    throw new PublicationTypeExistsException("Error with creating! A publication with the name " + name + " already exists. Please try again.");
            }
            catch (PublicationTypeExistsException err)
            {
                System.out.println(err.getReason());
            }

        }

        /**
         * Getter for the new pubType variable
         * @param PublicationType
         *                     The function will return the instance of the PublicationType
         * @return The instance of PublicationType
         */
        public PublicationType getNewPublicationType()
        {
            return pubType;
        }
    }
}
