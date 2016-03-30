
package com.codinginfinity.research.publication.domain;

import javax.persistence.*;

/**
 *
 * @author gershom
 */
 
 @Entity
public class Active extends PublicationTypeState{
   
   @Id 
   @GeneratedValue( strategy=GenerationType.AUTO )

   private int id;
	
   private Double accreditationPoints;

    /**
     * @return the accreditationPoints
     */
    public Double getAccreditationPoints() {
        return accreditationPoints;
    }

    /**
     * @param accreditationPoints the accreditationPoints to set
     */
    public void setAccreditationPoints(Double accreditationPoints) {
        this.accreditationPoints = accreditationPoints;
    }
    
    
}
