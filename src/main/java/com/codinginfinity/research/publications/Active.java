/** Active Class
* @author Elizabeth Bode
* @version 1.0
* @since 2016-03-17
*/

package com.codinginfinity.research.publications;

public class Active extends PublicationTypeState{
    Real accreditationPoints;
    
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
    * @param point
    *         The variable that will be used to change the value of the accreditationPoints variable
    */
    public void setAccreditationPoints(int points)
    {
        accreditationPoints.setPoints(points);
    }
    
    /**
    * Getter for accreditationPoints
    * @param int
    *           Returns the total accreditation points
    * @return The total accreditation points
    */
    public int getAccreditationPoints()
    {
        return accreditationPoints.getPoints();
    }

    void setEffectiveDate(Date date) {
        this.effectiveDate=date; 
    }
}
