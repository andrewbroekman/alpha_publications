package com.codinginfinity.research.publications;


import java.net.URL;
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
    public GetPublicationsForPersonResponse getPublicationsForPerson(GetPublicationsForPersonRequest publicationForPersonRequest) {
        
        GetPublicationsForPersonResponse publicationForPersonResponse = new GetPublicationsForPersonResponse();
        
        Publication publication = new Publication();
        PublicationType publicationType = new PublicationType();
        publicationType.setName("Accredited conferance paper");
        
        Date effDate = new Date("June", 2010, 4);
        Real accPoints = new Real(13);
        
        PublicationTypeState publicationTypeState= new Active(effDate,accPoints);
        publicationType.addStateEntry(publicationTypeState);
        
        PublicationTarget publicationTarget=new PublicationTarget();
        publicationTarget.setName("Journal");
//        publicationTarget.setWebSite(new URL(http://www.up.ac.za));
        
        PublicationState publicationState = new PublicationState(publicationType,publicationTarget);
        
        Date date = new Date("January", 2011, 4);
        publicationState.setDate(date);
        publicationState.setLifeCycleState(new Submitted());
        publicationState.setReason("The publication has been submitted");
        
        PublicationDetails publicationDetails = new PublicationDetails();
        publicationDetails.setTitle("Architectural patterns or styles");
        Date envisagedPublicationDate = new Date("June", 2010, 4);
        publicationDetails.setEnvisagedPublicationDate(envisagedPublicationDate);
        
        Person person = new Person();
        person.setFirstName("Dr Fritz");
        person.setSurname("Solms");
        publicationDetails.addAuthor(person);
        publicationState.setPublicationDetails(publicationDetails);
        
        publication.addStateEntry(publicationState);

        publicationForPersonResponse.addPublication(publication);

        return publicationForPersonResponse;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public ChangePublicationStateResponse changePublicationState(ChangePublicationStateRequest changePublicationStateRequest) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public GetPublicationsForGroupResponse getPublicationsForGroup(GetPublicationsForGroupRequest getPublicationsForGroupRequest) throws NoSuchPublicationException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public ModifyPublicationTypeResponse modifyPublicationType(ModifyPublicationTypeRequest modifyPublicationTypeRequest) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public AddPublicationTypeResponse addPublicationType(AddPublicationTypeRequest addPublicationTypeRequest) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
