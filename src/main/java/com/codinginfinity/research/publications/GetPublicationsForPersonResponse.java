
package com.codinginfinity.research.publications;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gershom
 */
public class GetPublicationsForPersonResponse {
    
      private List<Publication> publications = new ArrayList<>();
      
        /**
         * @return the publications
         */
        public List<Publication> getPublications() {
            return publications;
        }
        /**
         * @param publications the publications to set
         */
        public void setPublications(List<Publication> publications) {
            this.publications = publications;
        }
        public void addPublication(Publication publication){
            publications.add(publication);
        }

}
