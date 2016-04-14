/** Active Class
* @author Elizabeth Bode
 * @author Gian Paolo Buffo
* @version 1.1
* @since 2016-03-17
*/

package com.codinginfinity.research.publications;

import java.util.Date;

public class Active extends PublicationTypeState{
    private Real accreditationPoints;
    
    /**
    * Class constructor
    */
    public Active()
    {
        super();
        accreditationPoints = null;
    }
    
    /**
    * Class constructor
    */
    public Active(Date inDate, Real inPoints)
    {
    	super(inDate);
        accreditationPoints = inPoints;
    }
    
    /**
    * Setter for the accreditationPoints variable
    * @param points
    *         The variable that will be used to change the value of the accreditationPoints variable
    */
    public void setAccreditationPoints(int points)
    {
        accreditationPoints.setPoints(points);
    }
    
    /**
    * Getter for accreditationPoints
    * @return The total accreditation points
    */
    public int getAccreditationPoints()
    {
        return accreditationPoints.getPoints();
    }

    public void setEffectiveDate(Date date) {
        super.setEffectiveDate(date); 
    }
}
