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
public class NotActive extends PublicationTypeState{
      private String deactivationReason;

    /**
     * @return the deactivationReason
     */
    public String getDeactivationReason() {
        return deactivationReason;
    }

    /**
     * @param deactivationReason the deactivationReason to set
     */
    public void setDeactivationReason(String deactivationReason) {
        this.deactivationReason = deactivationReason;
    }
      
}
