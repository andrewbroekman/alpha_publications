
package com.codinginfinity.research.publication.domain;



import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author gershom
 */
 
 @Entity
public class Publication {
    @Id
    @GeneratedValue( strategy=GenerationType.AUTO )
     private Integer id;
	
    @OneToMany( targetEntity=PublicationState.class)	
    private List<PublicationState> publicationStates = new ArrayList<>();

    public void addStateEntry(PublicationState stateEntry) {
        publicationStates.add(stateEntry);
    }

    /**
     * @return the publicationStates
     */
    public List<PublicationState> getPublicationStates() {
        return publicationStates;
    }

    /**
     * @param publicationStates the publicationStates to set
     */
    public void setPublicationStates(List<PublicationState> publicationStates) {
        this.publicationStates = publicationStates;
    }

}
