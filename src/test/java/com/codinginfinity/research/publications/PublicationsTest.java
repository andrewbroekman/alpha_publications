
package com.codinginfinity.research.publications;


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
    public void testPublicationsForPerson() 
    {
        GetPublicationsForPersonResponse personResponse = publicationsMock.getPublicationsForPerson(new GetPublicationsForPersonRequest(new Person()));
        List<Publication> publications = personResponse.getPublications();
        for (Publication publication : publications) {
            assertTrue(!publication.getPublicationStates().isEmpty());
            List<PublicationState> publicationStates = publication.getPublicationStates();
            for (PublicationState publicationState : publicationStates) 
            {
                Assert.assertNotNull(publicationState.getDate());

                List<Person> authors = publicationState.getPublicationDetails().getAuthors();

                assertTrue(!authors.isEmpty());

                Assert.assertNotNull(publicationState.getPublicationDetails());

                Assert.assertNotNull(publicationState.getPublicationType());

                Assert.assertNotNull(publicationState.getReason());

                Assert.assertEquals(publicationState.getReason(), "The publication has been submitted");
                
                Assert.assertEquals(authors.get(0).getFirstName(), "Dr Fritz");
                
                Assert.assertEquals(authors.get(0).getSurname(), "Solms");
                
                Assert.assertEquals(publicationState.getPublicationDetails().getTitle(), "Architectural patterns or styles");
                
                Assert.assertEquals(publicationState.getPublicationTarget().getName(), "Journal");
                
                Assert.assertEquals(publicationState.getPublicationType().getName(), "Accredited conferance paper");
                
                Assert.assertEquals(publicationState.getPublicationType().getName(), "Accredited conferance paper");
                
                
            }
        }
    }
}

