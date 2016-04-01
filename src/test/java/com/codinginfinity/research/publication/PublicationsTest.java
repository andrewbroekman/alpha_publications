
package com.codinginfinity.research.publication;

import com.codinginfinity.research.publication.Publications.GetPublicationForGroupResponse;
import com.codinginfinity.research.publication.Publications.GetPublicationForPersonResponse;
import com.codinginfinity.research.publication.Publications.GetPublicationForGroupRequest;
import com.codinginfinity.research.publication.Publications.GetPublicationForPersonRequest;
import com.codinginfinity.research.publication.domain.Person;
import com.codinginfinity.research.publication.domain.Publication;
import com.codinginfinity.research.publication.domain.PublicationState;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author gershom
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PublicationsTestConfiguration.class})
public class PublicationsTest {

    @Inject
    private Publications publicationsMock;

    public PublicationsTest() {
    }

    @Test
    public void testPublicationsForPerson() {
        GetPublicationForPersonResponse personResponse = publicationsMock.getPublicationsForPerson(new GetPublicationForPersonRequest(new Person()));
        List<Publication> publications = personResponse.getPublications();
        for (Publication publication : publications) {
            assertTrue(!publication.getPublicationStates().isEmpty());
            List<PublicationState> publicationStates = publication.getPublicationStates();
            for (PublicationState publicationState : publicationStates) {
                Assert.assertNotNull(publicationState.getDate());

                Set<Person> authors = publicationState.getPublicationDetails().getAuthors();

                assertTrue(!authors.isEmpty());

                Assert.assertNotNull(publicationState.getPublicationDetails());

                Assert.assertNotNull(publicationState.getPublicationType());

                Assert.assertNotNull(publicationState.getReason());

                Assert.assertEquals(publicationState.getReason(), "The publication has been accepted");

                Assert.assertEquals(publicationState.getLifeCycleState().getState(), "accepted");
            }
        }
    }

    //@Ignore
    @Test
    public void testPublicationsForGroup() {
        //Testing returning more than one publication for for more than one person
        GetPublicationForGroupResponse groupResponse = publicationsMock.getPublicationsForGroup(new GetPublicationForGroupRequest());
        List<Publication> publications = groupResponse.getPublications();
        
        int count=0;
        for (Publication publication : publications) {
          
            List<PublicationState> publicationStates = publication.getPublicationStates();
            for (PublicationState publicationState : publicationStates) {
                Assert.assertNotNull(publicationState.getDate());

                Set<Person> authors = publicationState.getPublicationDetails().getAuthors();

                assertTrue(!authors.isEmpty());

                Assert.assertNotNull(publicationState.getPublicationDetails());

                Assert.assertNotNull(publicationState.getPublicationType());

                Assert.assertNotNull(publicationState.getReason());
                if(count==0){
                    Assert.assertEquals(publicationState.getReason(), "Publication published");
                    continue;
                }
                Assert.assertEquals(publicationState.getReason(), "Publication has been abandoned");
            }
        }
    }
}

