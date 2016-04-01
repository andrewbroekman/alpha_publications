
package com.codinginfinity.research.publication;

/**
 *
 * @author gershom
 */
public class GetPublicationForPersonRequest {
    
    private Period publicationPeriod;
    private Person person;
    private PublicationConfidenceLevel publicationConfidenceLevel;
    
    public GetPublicationForPersonRequest(){
            
    }
    public GetPublicationForPersonRequest(Person person) {
            this.person = person;
    }
    /**
     * @return the publicationPeriod
     */
    public Period getPublicationPeriod() {
        return publicationPeriod;
    }

    /**
     * @param publicationPeriod the publicationPeriod to set
     */
    public void setPublicationPeriod(Period publicationPeriod) {
        this.publicationPeriod = publicationPeriod;
    }

    /**
     * @return the person
     */
    public Person getPerson() {
        return person;
    }

    /**
     * @param person the person to set
     */
    public void setPerson(Person person) {
        this.person = person;
    }

    /**
     * @return the publicationConfidenceLevel
     */
    public PublicationConfidenceLevel getPublicationConfidenceLevel() {
        return publicationConfidenceLevel;
    }

    /**
     * @param publicationConfidenceLevel the publicationConfidenceLevel to set
     */
    public void setPublicationConfidenceLevel(PublicationConfidenceLevel publicationConfidenceLevel) {
        this.publicationConfidenceLevel = publicationConfidenceLevel;
    }
    
}
