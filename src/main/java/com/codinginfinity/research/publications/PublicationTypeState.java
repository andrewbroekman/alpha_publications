/** PublicationTypeState Class
* @author Elizabeth Bode
* @version 1.0
* @since 2016-03-17
*/

package com.codinginfinity.research.publications;

public class PublicationTypeState {
    Date effectiveDate;
    
    /**
    * Class constructor
    */
    public PublicationTypeState()
    {
        effectiveDate = null;
    }
    /**
    * Class constructor
    */
    public PublicationTypeState(Date effDate)
    {
        effectiveDate = effDate;
    }
    
    /**
    * Setter for the effectiveDate variable
    * @param date
    *         The variable that will be used to change the value of the effectiveDate variable
    */
    public void setEffectiveDate(Date date)
    {
        effectiveDate = date;
    }
    
    /**
    * Getter for effectiveDate
    * @param int
    *           Returns the effective date
    * @return The effective date
    */
    public Date getEffectiveDate()
    {
        return effectiveDate;
    }
}
