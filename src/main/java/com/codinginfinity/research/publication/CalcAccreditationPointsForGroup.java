
package com.codinginfinity.research.publication;

/**
 * @author Elton Tom
 * 
 */
public class CalcAccreditationPointsForGroup implements Publications {
    
    ResearchGroup researchGroup;
    
    /**
     * 
     * @param _researchGroup this is a ResearchGroup object on which 
     * the total accreditation points will be calculated using the 
     * CalcAccreditationPointsForGroup function
     */
    public CalcAccreditationPointsForGroup(ResearchGroup _researchGroup)
    {
        this.researchGroup = _researchGroup;
    }
    
    /**
     *
     * @return returns the total number of accreditation points for the
     * research group which was passed as a parameter in the PointsForGroup
     * constructor
     */
    @Override
    public double calcAccreditationPointsForGroup(ResearchGroup _researchGroup)
    {
        double sum = 0;
        Person[] p = researchGroup.getMembers();
        
        for(int i=0; i<researchGroup.getNumberMembers(); i++)
        {
            PointsForPerson pointsForPerson = new PointsForPerson(p[i]);
            sum += pointsForPerson.CalcAccreditationPointsForPerson(p[i]);
        }
        
        return sum;
    }
}
