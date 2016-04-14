package com.codinginfinity.research.publications;

/** PublicationWithTitleExistsForAuthors Class
 * An exception thrown when a user tries to create a publication with a title that already exists for its authors
 *
 * @author Gian Paolo Buffo
 * @author Christiaan Saaiman
 * @version 1.0
 * @since 2016-04-14
 */

public class PublicationWithTitleExistsForAuthors extends Exception {
    private String reason;

    /**
     * Class Constructor
     * @param reason
     *                The reason for the exception being thrown
     */
    public PublicationWithTitleExistsForAuthors(String reason) {
        super(reason);
    }

    /**
     * Setter for the Exception reason
     * @param reason
     *                The reason for the exception class sent to the parent method
     */
    protected void setReason(String reason){
        this.reason = reason;
    }

    /**
     * Getter for the Exception reason
     * @return
     *                Returns the reason for the Exception
     */
    public String getReason(){
        return reason;
    }
}
