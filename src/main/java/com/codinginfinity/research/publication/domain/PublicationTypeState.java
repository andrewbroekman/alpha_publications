
package com.codinginfinity.research.publication.domain;

import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author gershom
 */
 
 @Entity
public abstract class PublicationTypeState {
	
   @Id 
   @GeneratedValue( strategy=GenerationType.AUTO )

   private int id;	
     
    @OneToOne
    private Date effectiveDate;

    /**
     * @return the effectiveDate
     */
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * @param effectiveDate the effectiveDate to set
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }
}
