package com.codinginfinity.research.publication;

/**
 * @author Christiaan Saaiman
 * @version 1.0
 * @since 2016-03-22
 */
public interface Publications {
    AddPublicationResponse addPublication(AddPublicationRequest addPubReq);
    GetPublicationResponse getPublication(GetPublicationRequest getPubReq);
    CreatePublicationResponse createPublication(CreatePublicationRequest createPubReq);

    public class AddPublicationResponse{}
    public class AddPublicationRequest{}

    public class GetPublicationResponse{}
    public class GetPublicationRequest{}

    public class CreatePublicationResponse{}
    public class CreatePublicationRequest{}

    public class Exception{}
    public class PublicationWithTitleExistsForAuthors extends Exception{}
    public class InvalidRequest extends Exception{}
    public class NotAuthorized extends Exception{}

    public class PublicationState{
        private Date date;
        private Date envisagedPublicationDate;
    }

    public class PublicationType{}
    public class PublicationTarget{}

    public class LifeCycleState{}
    public class InProgress extends LifeCycleState{}
    public class Submitted extends LifeCycleState{}
    public class InRevision extends LifeCycleState{}
    public class Rejected extends LifeCycleState{}
    public class Published extends LifeCycleState{
        private Date publicationDate;
    }
    public class Abandoned extends LifeCycleState{}

    public class Date{}
}
