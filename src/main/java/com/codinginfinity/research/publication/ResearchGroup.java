
package com.codinginfinity.research.publication;

/**
 * Person object class implements all the related 
 * data,functions to represent the research group 
 * 
 * @author Elton Tom
 * 
 */
public class ResearchGroup {
    
    String researchGroupName;
    Person[] members;
    double accreditationPoints;
    int numberOfMembers;
    
    public ResearchGroup()
    {
    }
    
    /**
     * 
     * @param _researchGroupName this the string that sets the name of the research group
     * @param _accreditationPoints this the accreditation points of the research group
     */
    public ResearchGroup(String _researchGroupName, double _accreditationPoints)
    {
        researchGroupName = _researchGroupName;
        accreditationPoints = _accreditationPoints;
        members = new Person[10];
        numberOfMembers = 0;
        
        for (Person member : members)
        {
            member = new Person();
        }
    }
    
    /**
     * 
     * @param _person this is a Person object which is added the members array of the research group
     */
    public void addMemeber(Person _person)
    {
        members[numberOfMembers] = _person;
        numberOfMembers = numberOfMembers + 1;
    }
    
    /**
     * 
     * @return returns the number of accreditation points
     */
    public double getAccreditationPoints()
    {
        return accreditationPoints;
    }
    
    /**
     * 
     * @return the average number of accreditation points of the research group
     */
    public double getAverageAccreditationPoints()
    {
        return accreditationPoints/numberOfMembers;
    }
    
    /**
     * 
     * @return returns the research group's name
     */
    public String getResearchGroupName()
    {
        return researchGroupName;
    }
    
    /**
     * 
     * @return returns the array of members/persons of the research group
     */
    public Person[] getMembers()
    {
        return members;
    }
    
    /**
     * 
     * @return returns the number of members/persons in the research group
     */
    public int getNumberMembers()
    {
        return numberOfMembers;
    }
    
    /**
     * 
     * @return returns a string of all the members/person of the research group
     */
    public String printMembers()
    {
        String ret = "";
        for(int i=0; i<numberOfMembers; i++)
        {
            ret += members[i].getNames()+"\n";
            //System.out.println(members[i].getNames());
        }
        
        return ret;
    }
}
