
package com.codinginfinity.research.publication.domain;

import javax.persistence.*;

/**
 *
 * @author gershom
 */
  @Entity
public class Submitted extends LifeCycleState {
   
    @Id
    @GeneratedValue( strategy=GenerationType.AUTO )
     private Integer id;	
	
	
    public Submitted() {
    }
    @Override
    public String getState() {
        return "submitted";
    } 
}
