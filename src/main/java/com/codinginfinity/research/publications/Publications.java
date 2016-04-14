package com.codinginfinity.research.publications;

import java.util.Vector;


/**
 * The interface of the Publications module for the UP CS Research Management System
 *
 * @author Christiaan Saaiman
 * @author Gian Paolo Buffo
 * @author Sibusiso Masemola
 * @author Elizabeth Bode
 * @author Gershom Maluleke
 * @version 1.2
 * @since 2016-03-22
 */

public interface Publications {
    //AddPublicationResponse addPublication(AddPublicationRequest addPubReq);

    //GetPublicationResponse getPublication(GetPublicationRequest getPubReq);

    //CreatePublicationResponse createPublication(CreatePublicationRequest createPubReq);

    ChangePublicationStateResponse changePublicationState(ChangePublicationStateRequest changePublicationStateRequest);

    GetPublicationsForGroupResponse getPublicationsForGroup(GetPublicationsForGroupRequest getPublicationsForGroupRequest)throws NoSuchPublicationException;
    
    GetPublicationsForPersonResponse getPublicationsForPerson(GetPublicationsForPersonRequest publicationForPersonRequest);


    //GetPublicationResponse getPublication(GetPublicationRequest getPubReq);

    //CreatePublicationResponse createPublication(CreatePublicationRequest createPubReq);

    //Publication Types part of interface    
	public ModifyPublicationTypeResponse modifyPublicationType(ModifyPublicationTypeRequest modifyPublicationTypeRequest);

	public AddPublicationTypeResponse addPublicationType(AddPublicationTypeRequest addPublicationTypeRequest);  	
    
  }
