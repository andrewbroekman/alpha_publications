/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codinginfinity.research.publication.domain;

/**
 *
 * @author gershom
 */
public class Active extends PublicationTypeState{
    private Double accreditationPoints;

    /**
     * @return the accreditationPoints
     */
    public Double getAccreditationPoints() {
        return accreditationPoints;
    }

    /**
     * @param accreditationPoints the accreditationPoints to set
     */
    public void setAccreditationPoints(Double accreditationPoints) {
        this.accreditationPoints = accreditationPoints;
    }
    
    
}
