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
public class Submitted extends LifeCycleState {
    public Submitted() {
    }
    @Override
    public String getState() {
        return "submitted";
    } 
}
