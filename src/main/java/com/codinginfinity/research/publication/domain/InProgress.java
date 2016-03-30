
package com.codinginfinity.research.publication.domain;

import javax.persistence.*;

/**
 *
 * @author gershom
 */
 
 @Entity
public class InProgress extends LifeCycleState{
	
   @Id 
   @GeneratedValue( strategy=GenerationType.AUTO )

   private int id;	
	
	
   private Integer percentageCompleted;

    /**
     * @return the percentageCompleted
     */
    public Integer getPercentageCompleted() {
        return percentageCompleted;
    }

    /**
     * @param percentageCompleted the percentageCompleted to set
     */
    public void setPercentageCompleted(Integer percentageCompleted) {
        this.percentageCompleted = percentageCompleted;
    }

    @Override
    public String getState() {
        return "inprogress";
    }
   
   
}
