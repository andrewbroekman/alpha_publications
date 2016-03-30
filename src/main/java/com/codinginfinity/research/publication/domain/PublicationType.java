
package com.codinginfinity.research.publication.domain;


import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author gershom
 */
 
  @Entity
public class PublicationType{
    @Id
    @GeneratedValue( strategy=GenerationType.AUTO )
     private Integer id;	
	
    private String name;
	
    @OneToMany( targetEntity=PublicationTypeState.class)	
    private Set<PublicationTypeState> publicationTypeState=new HashSet<>();

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

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
}
