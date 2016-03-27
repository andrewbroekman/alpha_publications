/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codinginfinity.research.publication.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author gershom
 */
public class PublicationDetails{
    private String title;
    private Date envisagedPublicationDate;
    private Set<Person> authors = new HashSet<>();

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the envisagedPublicationDate
     */
    public Date getEnvisagedPublicationDate() {
        return envisagedPublicationDate;
    }

    /**
     * @param envisagedPublicationDate the envisagedPublicationDate to set
     */
    public void setEnvisagedPublicationDate(Date envisagedPublicationDate) {
        this.envisagedPublicationDate = envisagedPublicationDate;
    }

    /**
     * @return the authors
     */
    public Set<Person> getAuthors() {
        return authors;
    }

    /**
     * @param authors the authors to set
     */
    public void setAuthors(Set<Person> authors) {
        this.authors = authors;
    }

    public void addAuthor(Person person) {
        authors.add(person);
    }

    @Override
    public String toString() {
        return "PublicationDetails{" + "title=" + title + ", envisagedPublicationDate=" + envisagedPublicationDate + ", authors=" + authors + '}';
    }

}
