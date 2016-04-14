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
}
