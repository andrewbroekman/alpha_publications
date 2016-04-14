/** PublicationTypeExistsException Class
* @author Elizabeth Bode
* @version 1.0
* @since 2016-03-17
*/

package com.codinginfinity.research.publications;

public class PublicationTypeExistsException extends Exception{
    /**
    * Class constructor
    */
    public PublicationTypeExistsException(String reason)
    {
        super(reason);
    }
    
    /**
     * Getter for the publication type exists reason
     * @return The reason as a string
     */
    public String getReason()
    {
    	return super.getReason();
    }
    
    /**
     * Setter for the publication type exists reason
     * @param reason
     *                The reason coming in used to set the reason in the parent class
     */
    public void setReason(String reason)
    {
    	super.setReason(reason);
    }
}
