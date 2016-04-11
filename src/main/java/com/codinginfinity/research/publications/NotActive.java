/** NotActive Class
* @author Elizabeth Bode
* @version 1.0
* @since 2016-03-17
*/

package com.codinginfinity.research.publications;

public class NotActive extends PublicationTypeState{
    String deactivationReason;
    
    /**
    * Class constructor
    */
    public NotActive()
    {
        super();
        deactivationReason = "";
    }
    
    /**
    * Class constructor
    */
    public NotActive(Date effDate, String reason)
    {
        super(effDate);
        deactivationReason = reason;
    }
    
    /**
    * Setter for the deactivationReason variable
    * @param reason
    *         The variable that will be used to change the value of the deactivationReason variable
    */
    /*public void setDeactivationReason(String reason)
    {
        deactivationReason = reason;
    }*/
    
    /**
    * Getter for deactivationReason
    * @param String
    *           Returns the deactivation reason
    * @return The deactivationReason as a string
    */
    public String getDeactivationReason()
    {
        return deactivationReason;
    }
}
