/** AuthorizationException Class
* @author Elizabeth Bode
* @version 1.0
* @since 2016-03-17
*/

package com.codinginfinity.research.publications;

public class AuthorizationException extends Exception{
    String reason;
    
    /**
    * Class constructor
    */
    public AuthorizationException(String reason)
    {
    	super(reason);
    }
    
    /**
     * Getter for the authorization reason
     * @param String
     *                The function will return a string as the message
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
