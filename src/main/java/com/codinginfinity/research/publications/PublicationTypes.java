/** PublicationTypes Class
* @author Elizabeth Bode
* @version 1.0
* @since 2016-03-17
*/

package com.codinginfinity.research.publications;
import java.util.Date;

public class PublicationTypes {
    private String nameInput;
    private String descrInput;
    private Date effDateInput;
    private Real accPointsInput;
    private String reason;
    
    /**
    * Class constructor
    */
    public PublicationTypes(String inName, String inDescr, Date inEffDate, Real inPoints, String inReason) {
        nameInput = inName;
        descrInput = inDescr;
        effDateInput = inEffDate;
        accPointsInput = inPoints;
        reason = inReason;
    }
    
    /**
     * Tests if the user of the request has administrator rights
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
                modifyPublicationTypeRequest.addStateEntryForExistingType(effDateInput, accPointsInput, reason);
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
                addPublicationTypeRequest.addStateEntryForNewType(effDateInput, accPointsInput, reason);
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
