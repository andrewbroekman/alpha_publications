
package com.codinginfinity.research.publication.domain;

import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author gershom
 */
 
 @Entity
public class Published extends LifeCycleState{
	
    @Id
    @GeneratedValue( strategy=GenerationType.AUTO )
     private Integer id;		
	

    private Date publicationDate;
    @OneToOne
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
