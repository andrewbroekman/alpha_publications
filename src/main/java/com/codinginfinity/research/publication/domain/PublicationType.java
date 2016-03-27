/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codinginfinity.research.publication.domain;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author gershom
 */
public class PublicationType{

    private String name;
    private Set<PublicationTypeState> publicationTypeStates = new HashSet<>();

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

    /**
     * @return the publicationTypeStates
     */
    public Set<PublicationTypeState> getPublicationTypeStates() {
        return publicationTypeStates;
    }

    /**
     * @param publicationTypeStates the publicationTypeStates to set
     */
    public void setPublicationTypeStates(Set<PublicationTypeState> publicationTypeStates) {
        this.publicationTypeStates = publicationTypeStates;
    }
}
