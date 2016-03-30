
package com.codinginfinity.research.publication.domain;

import javax.persistence.*;

/**
 *
 * @author gershom
 */
  @Entity
public class NotActive extends PublicationTypeState{
	
     @Id 
     @GeneratedValue( strategy=GenerationType.AUTO )

     private int id;	
	
	
      private String deactivationReason;

    /**
     * @return the deactivationReason
     */
    public String getDeactivationReason() {
        return deactivationReason;
    }

    /**
     * @param deactivationReason the deactivationReason to set
     */
    public void setDeactivationReason(String deactivationReason) {
        this.deactivationReason = deactivationReason;
    }
      
}
