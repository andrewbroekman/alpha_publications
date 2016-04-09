package com.codinginfinity.research.publications;

import java.util.ArrayList;

/**
 * A class representing a publication
 *
 * @author Gian Paolo Buffo
 * @author Nhlahla Maluleke
 */

public class Publication {
     private ArrayList<PublicationState> stateEntries;

    public void addStateEntry(PublicationState stateEntry) {

    }

    /**
     * @return the stateEntries
     */
    public ArrayList<PublicationState> getStateEntries() {
        return stateEntries;
    }

    /**
     * @param stateEntries the stateEntries to set
     */
    public void setStateEntries(ArrayList<PublicationState> stateEntries) {
        this.stateEntries = stateEntries;
    }
}
