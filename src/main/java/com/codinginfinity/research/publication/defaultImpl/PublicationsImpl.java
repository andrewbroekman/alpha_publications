/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codinginfinity.research.publication.defaultImpl;

import com.codinginfinity.research.publication.Publications;
import javax.ejb.Stateless;
import org.springframework.stereotype.Service;

/**
 *
 * @author gershom
 */
@Stateless
@Service
public class PublicationsImpl implements Publications {
    @Override
    public GePublicationForPersonResponse getPublicationsForPerson(GetPublicationForPersonRequest publicationForPersonRequest) {
        GePublicationForPersonResponse publicationForPersonResponse = new GePublicationForGroupResponse();
        // findPublicationsForPerson(publicationForPersonRequest.getPeriod().getStart(),publicationForPersonRequest.getPeriod().getEnd(),publicationForPersonRequest.getPublicationConfidenceLevel().ACCEPTED,publicationForPersonRequest.getPerson()n);
        //TODO: This is where we make a call to the database through the persistence layer(JPA)
        publicationForPersonResponse.addPublication(null);
        return publicationForPersonResponse;
    }

    @Override
    public GePublicationForGroupResponse getPublicationsForGroup(GetPublicationForGroupRequest publicationForGroupRequest) {
        GePublicationForGroupResponse publicationForGroupResponse = new GePublicationForGroupResponse();

        //TODO: This is where we make a call to the database through the persistence layer(JPA)
        return publicationForGroupResponse;
    }
}
