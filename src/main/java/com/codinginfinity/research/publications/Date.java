 package com.codinginfinity.publications;

/** Date Class (needs to be implemented??)
* @author Elizabeth Bode
* @version 1.0
* @since 2016-03-17
*/

public class Date {
    String month;
    int year;
    int day;
    
    /**
    * Class constructor
    */
    public Date()
    {
        month = "";
        year = 0;
        day = 0;
    }
    
    public Date(String m, int y, int d)
    {
        month = m;
        year = y;
        day = d;
    }
    
    /**
    * Setter for the month, year and day variable
    * @param m
    *         The variable that will be used to change the value of the month
    * @param y
    *         The variable that will be used to change the value of the year
    * @param d
    *         The variable that will be used to change the value of the day
    */
    public void setDate(String m, int y, int d)
    {
        month = m;
        year = y;
        day = d;
    }
    
    /**
    * Getter for a string representing the date
    * @param String
    *           Returns the date as a string
    * @return The concatenated string of the date
    */
    public String getDate()
    {
        return Integer.toString(day) + " " + month + " " + Integer.toString(year);
    }
}
