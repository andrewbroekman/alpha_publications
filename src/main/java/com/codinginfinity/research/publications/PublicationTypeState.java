/** PublicationTypeState Class
* @author Elizabeth Bode
* @version 1.0
* @since 2016-03-17
*/

package com.codinginfinity.research.publications;
import java.util.Date;

public abstract class PublicationTypeState {
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
}
