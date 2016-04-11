/** ModifyPublicationTypeResponse Class
* @author Elizabeth Bode
* @version 1.0
* @since 2016-03-17
*/

package com.codinginfinity.research.publications;

public class ModifyPublicationTypeResponse {
    PublicationType newPubType;
    
    /**
    * Class constructor
    */
    public ModifyPublicationTypeResponse(PublicationType pt)
    {
        newPubType = pt;
    }
    
    /**
    * Returns the modifiedPublicationType using the getter
    * @param PublicationType
    *                     The function will return an instance of the PublicationType
    * @return The instance of PublicationType
    */
    /*public PublicationType sendModifiedPublicationType()
    {
        return modPubTypeReq.getModifiedPublicationType();
    }*/
}
