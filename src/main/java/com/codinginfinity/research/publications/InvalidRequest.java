/** InvalidRequest Class
 * @author Christiaan Saaiman
 * @version 1.0
 * @since 2016-04-14
 */

package com.codinginfinity.research.publications;

public class InvalidRequest extends Exception{
    String reason;

    /**
     * Class constructor
     */
    public InvalidRequest(String reason)
    {
        super(reason);
    }

    /**
     * Getter for the authorization reason
     * @return The reason as a string
     */
    public String getReason()
    {
        return super.getReason();
    }

    /**
     * Setter for the authorization reason
     * @param reason
     *                The reason coming in used to set the reason in the parent class
     */
    public void setReason(String reason)
    {
        super.setReason(reason);
    }
}