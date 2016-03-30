
package com.codinginfinity.research.publication.domain;

import javax.persistence.*;

/**
 *
 * @author gershom
 */
 
 @Entity
public class Person {
	
   @Id 
   @GeneratedValue( strategy=GenerationType.AUTO )

    private int id;	
	
    private String firstName;
    private String surname;
	

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" + "firstName=" + firstName + ", surname=" + surname + '}';
    }
    
    
}
