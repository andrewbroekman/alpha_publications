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
public class InProgress extends LifeCycleState{
   private Integer percentageCompleted;

    /**
     * @return the percentageCompleted
     */
    public Integer getPercentageCompleted() {
        return percentageCompleted;
    }

    /**
     * @param percentageCompleted the percentageCompleted to set
     */
    public void setPercentageCompleted(Integer percentageCompleted) {
        this.percentageCompleted = percentageCompleted;
    }

    @Override
    public String getState() {
        return "inprogress";
    }
   
   
}
