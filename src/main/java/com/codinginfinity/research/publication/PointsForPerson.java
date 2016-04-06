
package com.codinginfinity.research.publication;

/**
 * @author Elton Tom
 * 
 */
public class PointsForPerson implements Publications {
    
    Person person;
    
    /**
     * 
     * @param _person the is a Person object for whom the accreditation points
     * will be calculated using the CalcAccreditationPointsForPerson function
     */
    public PointsForPerson(Person _person)
    {
        this.person = _person;
    }

    /**
     * 
     * @return returns the number of accreditation points of the person
     * which was passed as a parameter in the PointsForPerson constructor
     */
    @Override
    public double CalcAccreditationPointsForPerson(Person _person)
    {
        double sum = 0;
        
        for(ResearchGroup researchGroups:person.getResearchGroupNames())
        {
            sum += researchGroups.getAccreditationPoints();
        }
        
        return sum;
    }

    public ChangePublicationStateResponse changePublicationState(ChangePublicationStateRequest changePublicationStateRequest)
    {
        return null;
    }

    public GetPublicationsForGroupResponse getPublicationsForGroup(GetPublicationsForGroupRequest getPublicationsForGroupRequest)throws NoSuchPublicationException
    {
        return null;
    }

    public GetPublicationsForPersonResponse getPublicationsForPerson(GetPublicationsForPersonRequest publicationForPersonRequest)
    {
        return null;
    }

    public double CalcAccreditationPointsForGroup(ResearchGroup _researchGroup)
    {
        return -1;
    }

    public ModifyPublicationTypeResponse modifyPublicationType(ModifyPublicationTypeRequest modifyPublicationTypeRequest)
    {
        return null;
    }

    public AddPublicationTypeResponse addPublicationType(AddPublicationTypeRequest addPublicationTypeRequest)
    {
        return null;
    }


}
