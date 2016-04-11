/** ModifyPublicationTypeRequest Class
* @author Elizabeth Bode
* @version 1.0
* @since 2016-03-17
*/

package com.codinginfinity.research.publications;
import java.util.*;

public class ModifyPublicationTypeRequest {
    PublicationType pubType;
    Vector pubTypeList;
    
    /**
    * Class constructor
    */
    public ModifyPublicationTypeRequest(PublicationType pt)
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
    public boolean verifyDuplicate(String name)
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
    public boolean verifyValidInput(Date inDate, Real inPoints, String inReason)
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
    public boolean verifyValidInput(String name, String description)
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
    public void addStateEntry(Date effDate, Real accPoints, String reason)
    {
        try
        {
            if (verifyValidInput(effDate, accPoints, reason))
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
            if (verifyDuplicate(name))
            {
                try
                {
                    if (verifyValidInput(name, description))
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
