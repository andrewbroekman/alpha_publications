package com.codinginfinity.research.publications;

/**
 * A class representing a user of the system. Currently used as a mock.
 *
 * @author Gian Paolo Buffo
 * @author Gershom Maluleke
 */

public class Person {
    private String firstName;
    private String surname;

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }
}
