package com.codinginfinity.research.publications;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Sibusiso 12270467
 * @version 1.0
 *@since 2016-03-21
 */


public class GetPublicationsForGroupTest {

    private Publications  _Pubs= null;
    private GetPublicationsForGroupRequest _PGR = null;


    @Before
    public void setUp() throws Exception {

        _Pubs = new GetPublicationsForGroup();
        _PGR = new GetPublicationsForGroupRequest();

    }

    @After
    public void tearDown() throws Exception {

    }

    /**
     * Sets mock object into normal state and checks that response associated with
     * input is correct.
     */
    @Test
    public void getPublicationsForGroupDefault() throws Exception{

        _Pubs.getPublicationsForGroup(_PGR);

    }

   /**
     * This test demonstrates the  PublicationRequest for mock objects. We are setting the
     * mock object to deal with an empty request input.
     * service contract refuses/cannot provide the service;
     *
     * @throws NoSuchPublicationException
     */
    @Test(expected = NoSuchPublicationException.class)
    public void getPublicationsForGroup() throws Exception{
         _PGR=null;
        _Pubs.getPublicationsForGroup(_PGR);

    }


    @Test
    public void changePublicationState() throws Exception {

    }
}








