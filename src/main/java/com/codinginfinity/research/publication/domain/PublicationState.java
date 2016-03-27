/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codinginfinity.research.publication.domain;

import java.util.Date;

/**
 *
 * @author gershom
 */
public class PublicationState{
    private Date date;
    private String reason;
    private PublicationDetails publicationDetails;
    private LifeCycleState lifeCycleState;
    private PublicationType publicationType;

    public PublicationState(PublicationType publicationType) {
        this.publicationType = publicationType;
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
