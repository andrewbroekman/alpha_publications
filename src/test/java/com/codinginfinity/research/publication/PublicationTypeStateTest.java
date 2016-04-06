/** PublicationTypeStateTest Class
* @author Elizabeth Bode
* @version 1.0
* @since 2016-03-23
*/

package com.codinginfinity.publications;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PublicationTypeStateTest {
    
    TestPublicationTypeState testState;
    
    @Before
    public void preTestInitialization() {
        try
        {
            Date testDate = new Date("October", 2016, 15);
            testState = new TestPublicationTypeState(testDate);
        }
        catch (Throwable ex)
        {
            fail("Contsructor claimed exception when no error occurred.");
        }
    }
    
    @After
    public void postTestCleanup() {
    }

    public class TestPublicationTypeState {
        Date effectiveDate;

        /**
        * Class constructor
        */
        public TestPublicationTypeState()
        {
            effectiveDate = null;
        }
        /**
        * Class constructor
        */
        public TestPublicationTypeState(Date effDate)
        {
            effectiveDate = effDate;
        }
    }
}
