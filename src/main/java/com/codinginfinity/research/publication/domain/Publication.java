/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codinginfinity.research.publication.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gershom
 */
public class Publication {
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
