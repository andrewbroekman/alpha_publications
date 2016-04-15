/** AddPublicationTypeRequest Class
 * @author Elizabeth Bode
 * @author Gian Paolo Buffo
 * @version 1.1
 * @since 2016-03-17
 */

package com.codinginfinity.research.publications;
import java.util.*;


public class AddPublicationTypeRequest {
    private PublicationType pubType;
    private Vector pubTypeList;

    /**
     * Class constructor
     */
    public AddPublicationTypeRequest(PublicationType pt)
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
     * @return The instance of PublicationType
     */
    public PublicationType getNewPublicationType()
    {
        return pubType;
    }
}
