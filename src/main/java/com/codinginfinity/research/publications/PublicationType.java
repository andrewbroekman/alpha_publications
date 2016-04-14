/** PublicationType Class
* @author Elizabeth Bode
* @version 1.0
* @since 2016-03-17
*/

package com.codinginfinity.research.publications;;

import java.util.Vector;

public class PublicationType {
    String name;
    String description;
    PublicationTypeState state;
    
    /**
    * Class constructor
    */
    public PublicationType()
    {
        name = "";
        description = "";
    }
    
    public PublicationType(String name, String description)
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
