/** EffectiveDateNotAfterEffectiveDateOfLastStateEntry Class
* @author Elizabeth Bode
* @version 1.0
* @since 2016-03-17
*/

package com.codinginfinity.research.publications;

public class EffectiveDateNotAfterEffectiveDateOfLastStateEntry extends Exception{
    String reason;

    /**
    * Class constructor
    */
    public EffectiveDateNotAfterEffectiveDateOfLastStateEntry(String reason)
    {
    	super(reason);
    }
    
    /**
     * Getter for the effective date not after effective date of last state entry reason
     * @param String
     *                The function will return a string as the message
     * @return The reason as a string
     */
    public String getReason()
    {
    	return super.getReason();
    }
    
    /**
     * Setter for the effective date not after effective date of last state entry reason
     * @param reason
     *                The reason coming in used to set the reason in the parent class
     */
    public void setReason(String reason)
    {
    	super.setReason(reason);
    }
}