package com.codinginfinity.research.publications;

/** AddPublicationRequest Class
 * @author Christiaan Saaiman
 * @version 1.0
 * @since 2016-04-14
 */
public class AddPublicationRequest {
    private PublicationState initialState;

    /**
     * Class Constructor
     */
    public AddPublicationRequest(){
        initialState = null;
    }

    /**
     * Class Constructor
     * @param initialState
     *              The initial state of the publication that is being added, such as Submitted, InRevision etc.
     */
    public AddPublicationRequest(PublicationState initialState){
        this.initialState = initialState;
    }

    /**
     * Setter for the initialState variable
     * @param initialState The state that it is going to be set to.
     */
    protected void setInitialState(PublicationState initialState){
        this.initialState = initialState;
    }

    /**
     * Getter for variable initialState
     * @return Returns the initialState variable
     */
    public PublicationState getInitialState(){
        return initialState;
    }
}
