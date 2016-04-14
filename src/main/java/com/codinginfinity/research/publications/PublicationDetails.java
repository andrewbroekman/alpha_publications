package com.codinginfinity.research.publications;

import java.util.ArrayList;
//import java.util.Date;
import java.util.List;
import java.util.Date;


/**
 * A class representing the details of a publication, such as the authors, title and envisaged publication date
 *
 * @author Gian Paolo Buffo
 * @author Gershom Maluleke
 */

public class PublicationDetails {
    private List<Person> authors=new ArrayList();
    private String title;
    private Date envisagedPublicationDate;
    
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
    public List<Person> getAuthors() {
        return authors;
    }

    /**
     * @param authors the authors to set
     */
    public void setAuthors(List<Person> authors) {
        this.authors = authors;
    }

    public void addAuthor(Person person) {
        authors.add(person);
    }
}
