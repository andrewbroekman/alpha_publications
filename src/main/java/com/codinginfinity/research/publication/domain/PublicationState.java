
package com.codinginfinity.research.publication.domain;

import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author gershom
 */
 
 @Entity
public class PublicationState{
	
   @Id 
   @GeneratedValue( strategy=GenerationType.AUTO )

    private int id;

    private Date date;
    private String reason;
    
    @OneToOne
    private PublicationDetails publicationDetails;
    @OneToOne
    private LifeCycleState lifeCycleState;
    @OneToOne
    private PublicationType publicationType;
     @OneToOne
    private PublicationTarget publicationTarget;
	
      /**
     * constructor
     */
	
	
    public PublicationState(){
    }
    
    public PublicationState(PublicationType publicationType,PublicationTarget mPublicationTarget) {
        this.publicationType = publicationType;
	this.publicationTarget=mPublicationTarget;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * @param reason the reason to set
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * @return the publicationDetails
     */
    public PublicationDetails getPublicationDetails() {
        return publicationDetails;
    }

    /**
     * @param publicationDetails the publicationDetails to set
     */
    public void setPublicationDetails(PublicationDetails publicationDetails) {
        this.publicationDetails = publicationDetails;
    }

    /**
     * @return the lifeCycleState
     */
    public LifeCycleState getLifeCycleState() {
        return lifeCycleState;
    }

    /**
     * @param lifeCycleState the lifeCycleState to set
     */
    public void setLifeCycleState(LifeCycleState lifeCycleState) {
        this.lifeCycleState = lifeCycleState;
    }

    /**
     * @return the publicationType
     */
    public PublicationType getPublicationType() {
        return publicationType;
    }

    /**
     * @param publicationType the publicationType to set
     */
    public void setPublicationType(PublicationType publicationType) {
        this.publicationType = publicationType;
    }

}
