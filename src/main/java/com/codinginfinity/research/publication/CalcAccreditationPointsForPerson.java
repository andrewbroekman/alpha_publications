
package com.codinginfinity.research.publication;

/**
 * @author Elton Tom
 * 
 */
public class CalcAccreditationPointsForPerson implements Publications {
    
    Person person;
    
    /**
     * 
     * @param _person the is a Person object for whom the accreditation points
     * will be calculated using the CalcAccreditationPointsForPerson function
     */
    public CalcAccreditationPointsForPerson(Person _person)
    {
        this.person = _person;
    }

    /**
     * 
     * @return returns the number of accreditation points of the person
     * which was passed as a parameter in the PointsForPerson constructor
     */
    @Override
    public double calcAccreditationPointsForPerson(Person _person)
    {
        double sum = 0;
        
        for(ResearchGroup researchGroups:person.getResearchGroupNames())
        {
            sum += researchGroups.getAccreditationPoints();
        }
        
        return sum;
    }
}
