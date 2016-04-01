package com.codinginfinity.research.publication;

/**
 * The interface of the Publications module for the UP CS Research Management System
 *
 * @author Christiaan Saaiman
 * @author Gian Paolo Buffo
 * @author Sibusiso Masemola
 * @version 1.1
 * @since 2016-03-22
 */

public interface Publications {
    //AddPublicationResponse addPublication(AddPublicationRequest addPubReq);

    //GetPublicationResponse getPublication(GetPublicationRequest getPubReq);

    //CreatePublicationResponse createPublication(CreatePublicationRequest createPubReq);

    ChangePublicationStateResponse changePublicationState(ChangePublicationStateRequest changePublicationStateRequest);

    GetPublicationsForGroupResponse getPublicationsForGroup(GetPublicationsForGroupRequest getPublicationsForGroupRequest)throws NoSuchPublicationException;


    //GetPublicationResponse getPublication(GetPublicationRequest getPubReq);

    //CreatePublicationResponse createPublication(CreatePublicationRequest createPubReq);

  }
