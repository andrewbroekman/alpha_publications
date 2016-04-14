package com.codinginfinity.research.publications;


import java.util.ArrayList;
import java.util.List;


/**
 * A class representing a publication
 *
 * @author Gian Paolo Buffo
 * @author Gershom Maluleke
 */

public class Publication {
     private List<PublicationState> publicationStates = new ArrayList<>();

    public void addStateEntry(PublicationState stateEntry) {
         getPublicationStates().add(stateEntry);

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
