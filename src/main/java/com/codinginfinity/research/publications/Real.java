/** Real Class (needs to be implemented)
* @author Elizabeth Bode
* @version 1.0
* @since 2016-03-17
*/

package com.codinginfinity.research.publications;

public class Real {
    int accreditPoints;
    
    /**
    * Class constructor
    */
    public Real()
    {
        accreditPoints = 0;
    }
    
    public Real(int points)
    {
        accreditPoints = points;
    }
    
    /**
    * Setter for the accreditPoints variable
    * @param points
    *         The variable that will be used to change the value of the accreditPoints variable
    */
    public void setPoints(int points)
    {
        accreditPoints = points;
    }
    
    /**
    * Getter for accreditPoints
    * @return The accreditation points
    */
    public int getPoints()
    {
        return accreditPoints;
    }
}
