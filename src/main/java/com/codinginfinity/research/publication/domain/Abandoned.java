
package com.codinginfinity.research.publication.domain;


import javax.persistence.*;

/**
 *
 * @author gershom
 */
 
@Entity
public class Abandoned extends LifeCycleState{
	
   @Id 
   @GeneratedValue( strategy=GenerationType.AUTO )

   private int id;	

    @Override
    public String getState() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
