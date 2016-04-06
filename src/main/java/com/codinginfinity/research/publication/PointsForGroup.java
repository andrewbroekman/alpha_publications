
package com.codinginfinity.research.publication;

/**
 * @author Elton Tom
 * 
 */
public class PointsForGroup implements Publications {
    
    ResearchGroup researchGroup;
    
    /**
     * 
     * @param _researchGroup this is a ResearchGroup object on which 
     * the total accreditation points will be calculated using the 
     * CalcAccreditationPointsForGroup function
     */
    public PointsForGroup(ResearchGroup _researchGroup)
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
    public double CalcAccreditationPointsForGroup(ResearchGroup _researchGroup)
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

    public double CalcAccreditationPointsForPerson(Person _person)
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
