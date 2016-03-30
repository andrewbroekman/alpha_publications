
package com.codinginfinity.research.publication.domain;

import javax.persistence.*;

/**
 *
 * @author gershom
 */
 
@Entity
public class BibTextEntry {
    @Id 
   @GeneratedValue( strategy=GenerationType.AUTO )

   private int id;
	
   public BibTextEntry(){
   }
    
}
