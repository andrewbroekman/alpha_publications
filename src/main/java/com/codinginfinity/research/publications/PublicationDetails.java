package com.codinginfinity.research.publications;

import com.codinginfinity.research.publications.Person;
import java.util.ArrayList;
import java.util.Date;

/**
 * A class representing the details of a publication, such as the authors, title and envisaged publication date
 *
 * @author Gian Paolo Buffo
 * @author Nhlahla Maluleke
 */

public class PublicationDetails {
    private ArrayList<Person> authors;
    private String title;
    private Date envisagedPublicationDate;

    
    public PublicationDetails(ArrayList<Person> mAuthors)
    {
        this.authors=mAuthors;
    }
    /**
     * @return the authors
     */
    public ArrayList<Person> getAuthors() {
        return authors;
    }

    /**
     * @param authors the authors to set
     */
    public void setAuthors(ArrayList<Person> authors) {
        this.authors = authors;
    }
    public void addAuthor(Person person) {
        authors.add(person);
    }

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
}
