package com.codinginfinity.research.publications;

/**
 * A class indicating that a publication has been submitted for review (ie it has an Submitted LifeCycleState)
 *
 * @author Gian Paolo Buffo
 */

public class Submitted extends LifeCycleState {
    
    public String getState()
    {
        return "Submitted";
    }

}
