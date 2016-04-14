/** PublicationType Class
* @author Elizabeth Bode
* @author Gershom Malululeke
* @version 1.0
* @since 2016-03-17
*/


package com.codinginfinity.research.publications;


import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class PublicationType {
    public String name;
    String description;
    PublicationTypeState state;     //I think this should be an ordered list,check domain model
    private Set<PublicationTypeState> publicationTypeState=new HashSet<>();
    
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
     * @return The list of publication types stored in the database
     */
    public Vector getPublicationTypesList()
    {
        return new Vector();
    }

    void setName(String mName) {
        this.name=mName;
    }
    /**
    * Setter for the type variable using the ModifyPublicationTypeResponse instance          
    */
    /*public void setModifiedType()
    {
        type = modPubTypeResp.sendModifiedPublicationType().type;
    }*/
    public void addStateEntry(PublicationTypeState stateEntry) {
        publicationTypeState.add(stateEntry);
    }

     /**
     * @return the publicationTypeState
     */
    public Set<PublicationTypeState> getPublicationTypeState() {
        return publicationTypeState;
    }

    /**
     * @param publicationTypeState the publicationTypeState to set
     */
    public void setPublicationTypeState(Set<PublicationTypeState> publicationTypeState) {
        this.publicationTypeState = publicationTypeState;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
}
