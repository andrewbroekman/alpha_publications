package com.codinginfinity.research.publications;

/** AddPublicationResponse Class
 * @author Christiaan Saaiman
 * @version 1.0
 * @since 2016-04-14
 */
public class AddPublicationResponse {
    private Publication addedPublication;

    /**
     * Class Constructor
     */
    public AddPublicationResponse(){
        addedPublication = null;
    }

    /**
     * Class Constructor
     * @param addedPublication
     *             The publication that was added to the system
     */
    public AddPublicationResponse(Publication addedPublication){
        this.addedPublication = addedPublication;
    }
}
