
package com.codinginfinity.research.publication.domain;


import java.net.URL;
import javax.persistence.*;

/**
 *
 * @author gershom
 */
 @Entity
public class PublicationTarget {
	
     @Id 
     @GeneratedValue( strategy=GenerationType.AUTO )

     private int id;		
	
    private String name;
    private URL website;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the website
     */
    public URL getWebsite() {
        return website;
    }

    /**
     * @param website the website to set
     */
    public void setWebsite(URL website) {
        this.website = website;
    }
    
    
}
