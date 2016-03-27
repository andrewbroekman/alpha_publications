/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codinginfinity.research.publication.domain;

import java.util.Date;

/**
 *
 * @author gershom
 */
public class Published extends LifeCycleState{
    private Date publicationDate;
    private BibTextEntry bibTextEntry;

    /**
     * @return the publicationDate
     */
    public Date getPublicationDate() {
        return publicationDate;
    }

    /**
     * @param publicationDate the publicationDate to set
     */
    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    /**
     * @return the bibTextEntry
     */
    public BibTextEntry getBibTextEntry() {
        return bibTextEntry;
    }

    /**
     * @param bibTextEntry the bibTextEntry to set
     */
    public void setBibTextEntry(BibTextEntry bibTextEntry) {
        this.bibTextEntry = bibTextEntry;
    }

    @Override
    public String getState() {
        return "published";
    }
}
