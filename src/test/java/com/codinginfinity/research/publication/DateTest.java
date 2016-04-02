/** DateTest Class
* @author Elizabeth Bode
* @version 1.0
* @since 2016-03-23
*/

package com.codinginfinity.publications;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DateTest {
    @Before
    public void preTestInitialization() {
    }
    
    @After
    public void postTestCleanup() {
    }
    
    /**
     * Test of setDate method
     */
    /*@Test
    public void testSetDate() {
        System.out.println("setDate");
        String m = "";
        int y = 0;
        int d = 0;
        Date instance = new Date();
        instance.setDate(m, y, d);
        //assertEquals(expResult, result);
    }*/

    /**
     * Test of getDate method
     */
    /*@Test
    public void testGetDate() {
        System.out.println("getDate");
        Date instance = new Date();
        String expResult = "";
        String result = instance.getDate();
        assertEquals(expResult, result);
    }*/
    public class TestDate {
        String month;
        int year;
        int day;

        /**
        * Class constructor
        */
        public TestDate()
        {
            month = "";
            year = 0;
            day = 0;
        }

        public TestDate(String m, int y, int d)
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
}
