
package com.codinginfinity.research.publication.domain;

import javax.persistence.*;

/**
 *
 * @author gershom
 */
 @Entity
public class Accepted extends LifeCycleState {
	
   @Id 
   @GeneratedValue( strategy=GenerationType.AUTO )

   private int id;
	
    @Override
    public String getState() {
        return "accepted";
    }
}