/** InvalidInputException Class
* @author Elizabeth Bode
* @version 1.0
* @since 2016-03-17
*/

package com.codinginfinity.research.publications;

public class InvalidInputException extends Exception{
    /**
    * Class constructor
    */
    public InvalidInputException(String reason)
    {
        super(reason);
    }
    
    /**
     * Getter for the invalid input reason
     * @return The reason as a string
     */
    public String getReason()
    {
    	return super.getReason();
    }
    
    /**
     * Setter for the invalid input reason
     * @param reason
     *                The reason coming in used to set the reason in the parent class
     */
    public void setReason(String reason)
    {
    	super.setReason(reason);
    }
}
