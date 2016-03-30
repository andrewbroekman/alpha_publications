
package com.codinginfinity.research.publication.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author gershom
 */
 @Entity
 public class PublicationDetails{
   
	 
    @Id
    @GeneratedValue( strategy=GenerationType.AUTO )
    private Integer id;	 
	 
    private String title;
    private Date envisagedPublicationDate;
	 
     @OneToMany( targetEntity=Person.class)		 
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
