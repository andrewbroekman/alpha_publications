/** AddPublicationTypeResponse Class
 * @author Elizabeth Bode
 * @version 1.0
 * @since 2016-03-17
 */

package com.codinginfinity.research.publications;

public class AddPublicationTypeResponse {
    PublicationType newPubType;

    /**
     * Class constructor
     */
    public AddPublicationTypeResponse(PublicationType pt)
    {
        newPubType = pt;
    }
}
