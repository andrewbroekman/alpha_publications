package com.codinginfinity.research.publication;

/**
 * A class representing a user of the system. Currently used as a mock.
 *
 * @author Gian Paolo Buffo
 * @author Elton Tom
 */

public class Person {
    // mock

    private String firstName, surname;
    private int numberOfResearchGroups;
    private ResearchGroup[] groups;

    Person()
    {
    }
    /**
     *
     * @param _firstName this string is set as the person's first name
     * @param _surname this string is set as the person's surname
     */
    Person(String _firstName, String _surname)
    {
        firstName = _firstName;
        surname = _surname;
        groups = new ResearchGroup[100];
        numberOfResearchGroups = 0;

        for(int i=0; i<groups.length; i++)
        {
            groups[i] = new ResearchGroup();
        }
    }

    /*Person(String _firstName, String _surname, double _accreditationPoints, String[] _researchGroupNames)
    {
        firstName = _firstName;
        surname = _surname;
    }*/

    /**
     *
     * @param _firstName this string sets the person's first name
     * @param _surname this string sets the person's surname
     */
    public void setNames(String _firstName, String _surname)
    {
        firstName = _firstName;
        surname = _surname;
    }


    /**
     *
     * @param _researchGroup adds a research group to the person's research group array
     */
    public void addResearchGroup(ResearchGroup _researchGroup)
    {
        groups[numberOfResearchGroups] = _researchGroup;

        numberOfResearchGroups++;
        //System.out.println("total: "+numberOfResearchGroups);
    }

    /**
     *
     * @return returns the person's first name
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     *
     * @return returns the person's surname
     */
    public String getSurname()
    {
        return surname;
    }

    /**
     *
     * @return returns both the person's first name and surname as on string
     */
    public String getNames()
    {
        return firstName+" "+surname;
    }

    /**
     *
     * @return returns all the research groups that the person belongs
     * to which were stored in a ResearchGroup array
     */
    public ResearchGroup[] getResearchGroupNames()
    {
        return groups;
    }

}
