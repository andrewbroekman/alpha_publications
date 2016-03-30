
package com.codinginfinity.research.publication.domain;

import javax.persistence.*;

/**
 *
 * @author gershom
 */
 
 @Entity
public abstract class LifeCycleState {
   @Id 
   @GeneratedValue( strategy=GenerationType.AUTO )

   private int id;
	
    public abstract String getState();
}
