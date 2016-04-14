package com.codinginfinity.research.publications;

import java.util.Date;

//import java.util.Date;

/**
 * A class representing the current state of a publication.
 *
 * @author Gian Paolo Buffo
 * @author Gershom Maluleke
 */

public class PublicationState {
    private PublicationTarget publicationTarget;
    private PublicationDetails publicationDetails;
    private Date date;
    private LifeCycleState lifeCycleState;
    private String reason;
    // todo add PublicationType. PublicationType related classes can be in their own folder, since there are so many
    private PublicationType publicationType;
    
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

    /**
     * @return the publicationTarget
     */
    public PublicationTarget getPublicationTarget() {
        return publicationTarget;
    }

    /**
     * @param publicationTarget the publicationTarget to set
     */
    public void setPublicationTarget(PublicationTarget publicationTarget) {
        this.publicationTarget = publicationTarget;
    }
}
