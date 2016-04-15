/** ModifyPublicationTypeRequestTest Class
* @author Elizabeth Bode
* @author Gian Paolo Buffo
* @version 1.1
* @since 2016-03-23
*/

package com.codinginfinity.research.publications;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ModifyPublicationTypeRequestTest {
    private List<PublicationType> testPubType;
    private List<TestModifyPublicationTypeRequest> testRequest;
    
    @Before
    public void preTestInitialization() {
        try
        {
            testPubType = new LinkedList<PublicationType>();
            testPubType.add(new PublicationType("testName", "testDescription"));
            testPubType.add(new PublicationType("testName", ""));
            testPubType.add(new PublicationType("", "testDescription"));
            testPubType.add(new PublicationType("", ""));
            testRequest = new LinkedList<TestModifyPublicationTypeRequest>();
            for (int i = 0; i < testRequest.size(); i++)
            {
                testRequest.add(new TestModifyPublicationTypeRequest(testPubType.get(i)));
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
    public void testVerifyModifyDuplicate() {
        System.out.println("verifyModifyDuplicate");
        boolean expResult = false;
        boolean result;
        for (int i = 0; i < testRequest.size(); i++)
        {
            result = testRequest.get(i).verifyModifyDuplicate(testRequest.get(i).pubType.name);
            assertEquals(expResult, result);
        }
    }

    /**
     * Test of verifyValidInput method
     */
    @Test
    public void testVerifyModifyValidInput_3args() {
        System.out.println("verifyModifyValidInput");
        Date inDate = new Date();
        Real inPoints = new Real(20);
        String inReason = "testReason";
        boolean expResult = false;
        boolean result;
        for (int i = 0; i < testRequest.size(); i++)
        {
            result = testRequest.get(i).verifyModifyValidInput(inDate, inPoints, inReason);
            assertEquals(expResult, result);
        }
    }

    /**
     * Test of verifyValidInput method
     */
    @Test
    public void testVerifyModifyValidInput_String_String() {
        System.out.println("verifyModifyValidInput");
        String name = "testName";
        String description = "testDescription";
        PublicationType testPubType = new PublicationType("testName", "testDescription");
        TestModifyPublicationTypeRequest testRequest = new TestModifyPublicationTypeRequest(testPubType);
        boolean expResult = true;
        boolean result = testRequest.verifyModifyValidInput(name, description);
        assertEquals(expResult, result);
    }

    /**
     * Test of addStateEntry method
     */
    @Test
    public void testAddStateEntryForExistingType() {
        System.out.println("addStateEntryForExistingType");
        Date effDate = new Date();
        Real accPoints = new Real(20);
        String reason = "testReason";
        PublicationType testPubType = new PublicationType("testName", "testDescr");
        TestModifyPublicationTypeRequest instance = new TestModifyPublicationTypeRequest(testPubType);
        instance.addStateEntryForExistingType(effDate, accPoints, reason);
        assertEquals(effDate, instance.pubType.state.getEffectiveDate());
        //assertEquals(accPoints, instance.pubType.state.accreditationPoints.getAccreditationPoints());
        //assertEquals(reason, instance.pubType.state.deactivationReason.getDeactivationReason());
    }

    /**
     * Test of setModifiedPublicationType method
     */
    @Test
    public void testSetModifiedPublicationType() {
        try
        {
            System.out.println("setModifiedPublicationType");
            String name = "testName2";
            String description = "testDescr2";
            PublicationType testPubType = new PublicationType("testName", "testDescr");
            TestModifyPublicationTypeRequest instance = new TestModifyPublicationTypeRequest(testPubType);
            instance.setModifiedPublicationType(name, description);
            assertEquals(name, instance.pubType.name);
            assertEquals(description, instance.pubType.description);
        }
        catch (Throwable ex)
        {
            fail("setModifiedPublicationType claimed there was an error when there shouldn't have been.");
        }
    }

    /**
     * Test of getModifiedPublicationType method
     */
    @Test
    public void testGetModifiedPublicationType() {
        System.out.println("getModifiedPublicationType");
        PublicationType expResult = new PublicationType("testName", "testDescr");
        TestModifyPublicationTypeRequest instance = new TestModifyPublicationTypeRequest(expResult);
        assertEquals(expResult, instance.getModifiedPublicationType());
    }
    
    public class TestModifyPublicationTypeRequest {
        private PublicationType pubType;
        private Vector pubTypeList;

        /**
        * Class constructor
        */
        public TestModifyPublicationTypeRequest(PublicationType pt)
        {
            pubType = pt;
            pubTypeList = pubType.getPublicationTypesList();
        }

        /**
         * Verifies that the new publication type name doesn't already exist according to publication type name
         * @param name
         *            The name of the publication type used as a comparison
         * @return 
         *         true if a publication type with that name doesn't exist
         *         false if a publication type with that name already exists
         */
        public boolean verifyModifyDuplicate(String name)
        {
            for (int i = 0; i < pubTypeList.size(); i++)
            {
                if (name == pubTypeList.get(i))//.name
                    return false;
            }
            return true;
        }

        /**
         * Verifies that none of the parameters are empty, that they are the right format, that the date isn't in the past and that the new date is after the current effective date
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
        public boolean verifyModifyValidInput(Date inDate, Real inPoints, String inReason)
        {
            if (inReason != "")//NumberUtils.isNumber(inPoints.accreditPoints) && inDate.month > new Date() && inDate > pubType.state.effDate && 
                return true;
            else
                return false;
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
        public boolean verifyModifyValidInput(String name, String description)
        {
            if (name != "" && description != null)
                return true;
            else
                return false;
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
        public void addStateEntryForExistingType(Date effDate, Real accPoints, String reason)
        {
            try
            {
                if (verifyModifyValidInput(effDate, accPoints, reason))
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
        * Setter for the pubType variable
        * @param pt
        *         The variable that will be used to change the value of the pubType           
        */
        public void setModifiedPublicationType(String name, String description)
        {
            try
            {
                if (verifyModifyDuplicate(name))
                {
                    try
                    {
                        if (verifyModifyValidInput(name, description))
                        {
                            pubType.name = name;
                            pubType.description = description;
                        }
                        else
                            throw new InvalidInputException("Error with editing! Publication type's name or description have incorrect input. Please try again.");
                    }
                    catch(InvalidInputException err)
                    {
                        System.out.println(err.getReason());
                    }                
                }
                else
                    throw new PublicationTypeExistsException("Error with editing! A publication with the name " + name + " already exists. Please try again.");
            }
            catch (PublicationTypeExistsException err)
            {
                System.out.println(err.getReason());
            }
        }

        /**
        * Getter for the pubType variable
        * @param PublicationType
        *                     The function will return the instance of the PublicationType
        * @return The instance of PublicationType
        */
        public PublicationType getModifiedPublicationType()
        {
            return pubType;
        }
    }
}
