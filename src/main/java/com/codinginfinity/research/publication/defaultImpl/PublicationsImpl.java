
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
    public GetPublicationForPersonResponse getPublicationsForPerson(GetPublicationForPersonRequest publicationForPersonRequest){
        GetPublicationForPersonResponse publicationForPersonResponse = new GetPublicationForGroupResponse();
        // findPublicationsForPerson(publicationForPersonRequest.getPeriod().getStart(),publicationForPersonRequest.getPeriod().getEnd(),publicationForPersonRequest.getPublicationConfidenceLevel().ACCEPTED,publicationForPersonRequest.getPerson()n);
        //TODO: This is where we make a call to the database through the persistence layer(JPA)
        publicationForPersonResponse.addPublication(null);
        return publicationForPersonResponse;
    }

    @Override
    public GetPublicationForGroupResponse getPublicationsForGroup(GetPublicationForGroupRequest publicationForGroupRequest){
        GetPublicationForGroupResponse publicationForGroupResponse = new GetPublicationForGroupResponse();

        //TODO: This is where we make a call to the database through the persistence layer(JPA)
        return publicationForGroupResponse;
    }
}
