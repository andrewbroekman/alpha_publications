/** NotActive Class
* @author Elizabeth Bode
 * @author Gian Paolo Buffo
* @version 1.1
* @since 2016-03-17
*/

package com.codinginfinity.research.publications;

import java.util.Date;

public class NotActive extends PublicationTypeState{
    private String deactivationReason;
    
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
    * @return The deactivationReason as a string
    */
    public String getDeactivationReason()
    {
        return deactivationReason;
    }

    public void setEffectiveDate(Date date) {
        super.setEffectiveDate(date); 
    }
}
