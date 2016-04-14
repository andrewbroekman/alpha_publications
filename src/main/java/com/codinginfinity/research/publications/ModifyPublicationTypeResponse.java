/** ModifyPublicationTypeResponse Class
* @author Elizabeth Bode
* @version 1.0
* @since 2016-03-17
*/

package com.codinginfinity.research.publications;

public class ModifyPublicationTypeResponse {
    private PublicationType newPubType;
    
    /**
    * Class constructor
    */
    public ModifyPublicationTypeResponse()
    {
        newPubType = null;
    }
        
    public ModifyPublicationTypeResponse(PublicationType pt)
    {
        newPubType = pt;
    }
    
    /**
    * Setter for the newPubType variable
    * @param pt
    *         The variable that will be used to change the value of the newPubType variable
    */
    public void setModifyPublicationTypeResponse(PublicationType pt)
    {
        newPubType = pt;
    }
    
    /**
    * Getter for newPubType
    * @param PublicationType
    *           Returns the new publication type
    * @return The new publication type
    */
    public PublicationType getModifyPublicationTypeResponse()
    {
        return newPubType;
    }
}
