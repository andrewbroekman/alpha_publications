
package com.codinginfinity.research.publication.mocking;

import com.codinginfinity.research.publication.Publications;
import com.codinginfinity.research.publication.domain.Abandoned;
import com.codinginfinity.research.publication.domain.Accepted;
import com.codinginfinity.research.publication.domain.Active;
import com.codinginfinity.research.publication.domain.Person;
import com.codinginfinity.research.publication.domain.Publication;
import com.codinginfinity.research.publication.domain.PublicationDetails;
import com.codinginfinity.research.publication.domain.PublicationState;
import com.codinginfinity.research.publication.domain.PublicationTarget;
import com.codinginfinity.research.publication.domain.PublicationType;
import com.codinginfinity.research.publication.domain.Published;
import java.util.Date;
import javax.ejb.Stateless;
import org.springframework.stereotype.Service;

/**
 *
 * @author gershom
 */
@Stateless
@Service
public class PublicationsMock  implements Publications {

    @Override
    public GetPublicationForPersonResponse getPublicationsForPerson(GetPublicationForPersonRequest publicationForPersonRequest) {
        GetPublicationForPersonResponse publicationForPersonResponse = new GetPublicationForPersonResponse();

        Publication publication = new Publication();

        PublicationType publicationType = new PublicationType();
        publicationType.setName("Book");

        Active active = new Active();
        active.setEffectiveDate(new Date());
        active.setAccreditationPoints(25.6);

        publicationType.addStateEntry(active);

        PublicationState publicationState = new PublicationState(publicationType,new PublicationTarget());
        publicationState.setDate(new Date());
        publicationState.setLifeCycleState(new Accepted());
        publicationState.setReason("The publication has been accepted");

        PublicationDetails publicationDetails = new PublicationDetails();
        publicationDetails.setTitle("The book of eli");
        publicationDetails.setEnvisagedPublicationDate(new Date());
        Person person = new Person();
        person.setFirstName("Gershom");
        person.setSurname("Maluks");
        publicationDetails.addAuthor(person);

        publicationState.setPublicationDetails(publicationDetails);

        publication.addStateEntry(publicationState);

        publicationForPersonResponse.addPublication(publication);

        return publicationForPersonResponse;
    }

    @Override
    public GetPublicationForGroupResponse getPublicationsForGroup(GetPublicationForGroupRequest publicationForGroupRequest) {
        GetPublicationForGroupResponse publicationForGroupResponse = new GetPublicationForGroupResponse();
        
        //Testing for return more than one publication
        Publication publication1 = new Publication();

        PublicationType publicationType = new PublicationType();
        publicationType.setName("accredited conferance paper");

        Active active = new Active();
        active.setEffectiveDate(new Date());
        active.setAccreditationPoints(14.6);

        publicationType.addStateEntry(active);

        PublicationState publicationState = new PublicationState(publicationType,new PublicationTarget());
        publicationState.setDate(new Date());
        publicationState.setLifeCycleState(new Abandoned());
        publicationState.setReason("Publication published");

        PublicationDetails publicationDetails = new PublicationDetails();
        publicationDetails.setTitle("The Tripper");
        publicationDetails.setEnvisagedPublicationDate(new Date());
        Person person = new Person();
        person.setFirstName("Elton");
        person.setSurname("Tom");
        publicationDetails.addAuthor(person);

        publicationState.setPublicationDetails(publicationDetails);

        publication1.addStateEntry(publicationState);
        
        Publication publication2 = new Publication();

        PublicationType publicationType2 = new PublicationType();
        publicationType2.setName("High impact journal");

        Active active2 = new Active();
        active2.setEffectiveDate(new Date());
        active2.setAccreditationPoints(14.6);

        publicationType2.addStateEntry(active);

        PublicationState publicationState2 = new PublicationState(publicationType2,new PublicationTarget());
        publicationState2.setDate(new Date());
        publicationState2.setLifeCycleState(new Published());
        publicationState2.setReason("Publication has been abandoned");

        PublicationDetails publicationDetails2 = new PublicationDetails();
        publicationDetails2.setTitle("The English Patient");
        publicationDetails2.setEnvisagedPublicationDate(new Date());
        Person person2 = new Person();
        person2.setFirstName("Gershom");
        person2.setSurname("Maluleke");
        publicationDetails2.addAuthor(person);

        publicationState2.setPublicationDetails(publicationDetails);

        publication2.addStateEntry(publicationState);
        
        

        publicationForGroupResponse.addPublication(publication1);
        publicationForGroupResponse.addPublication(publication2);
        return publicationForGroupResponse;
    }
}
