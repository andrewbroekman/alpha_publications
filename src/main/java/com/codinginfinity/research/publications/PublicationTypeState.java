/** PublicationTypeState Class
 * @author Elizabeth Bode
 * @author Gian Paolo Buffo
 * @version 1.1
 * @since 2016-03-17
*/

package com.codinginfinity.research.publications;

import java.util.Date;

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
}
