package com.codinginfinity.research.publication;
import java.util.Vector;

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
    
    GetPublicationsForPersonResponse getPublicationsForPerson(GetPublicationsForPersonRequest publicationForPersonRequest);


    //GetPublicationResponse getPublication(GetPublicationRequest getPubReq);

    //CreatePublicationResponse createPublication(CreatePublicationRequest createPubReq);

    // Publication Types part of interface
    public class PublicationTypeState {
    	public PublicationTypeState(){}
    	public PublicationTypeState(Date effDate){}
    }

    public class Active extends PublicationTypeState {
    	public Active(){}
    	public Active(Date inDate, Real inPoints){}
    	public void setAccreditationPoints(int points){}
    	public int getAccreditationPoints(){return null;}
    }

    public class NotActive extends PublicationTypeState {
    	public NotActive(){}
    	public NotActive(Date effDate, String reason){}
    	public String getDeactivationReason(){return null;}
    }

    public class PublicationType {
    	public PublicationType(){}
    	public PublicationType(String name, String description){}
    	public Vector getPublicationTypesList(){return null;}
    }

    public class AddPublicationTypeRequest {
    	public AddPublicationTypeRequest(PublicationType pt){}
    	public boolean verifyDuplicate(String name){return false;}
    	public boolean verifyValidInput(Date inDate, Real inPoints, String inReason){return false;}
    	public boolean verifyValidInput(String name, String description){return false;}
    	public void addStateEntry(Date effDate, Real accPoints, String reason){}
    	public void createPublicationType(String name, String description){}
    	public PublicationType getNewPublicationType(){return null;}
    }

    public class AddPublicationTypeResponse {
    	public AddPublicationTypeResponse(PublicationType pt){}
    }

    public class Date {
    	public Date(){}
    	public Date(String m, int y, int d){}
    	public void setDate(String m, int y, int d){}
    	public String getDate(){return null;}
    }

    public class Real {
    	public Real(){}
    	public Real(int points){}
    	public void setPoints(int points){}
    	public int getPoints(){return null;}
    }

    public class ModifyPublicationTypeRequest {
    	public ModifyPublicationTypeRequest(PublicationType pt){}
    	public boolean verifyDuplicate(String name){return false;}
    	public boolean verifyValidInput(Date inDate, Real inPoints, String inReason){return false;}
    	public boolean verifyValidInput(String name, String description){return false;}
    	public void addStateEntry(Date effDate, Real accPoints, String reason){}
    	public void setModifiedPublicationType(String name, String description){}
    	public PublicationType getModifiedPublicationType(){return null;}
    }

    public class ModifyPublicationTypeResponse {
    	public ModifyPublicationTypeResponse(PublicationType pt){}    	
    }

    public class PublicationTypes {
    	public PublicationTypes(String inName, String inDescr, Date inEffDate, Real inPoints, String inReason){}
    	public boolean isAdmin(){return false;}
    	public void persistObject(PublicationType pt){}
    	public ModifyPublicationTypeResponse modifyPublicationType(ModifyPublicationTypeRequest modifyPublicationTypeRequest){return null;}
    	public AddPublicationTypeResponse addPublicationType(AddPublicationTypeRequest addPublicationTypeRequest){return null;}    	
    }

    public class Exception extends Throwable {
    	public Exception(String reason){}
    	protected void setReason(String reason){}
    	public String getReason(){return null;}
    }

    public class AuthorizationException extends Exception {
    	public AuthorizationException(String reason){}
    	public String getReason(){return null;}
    	public void setReason(String reason){}
    }

    public class EffectiveDateNotAfterEffectiveDateOfLastStateEntry extends Exception {
    	public EffectiveDateNotAfterEffectiveDateOfLastStateEntry(String reason){}
    	public String getReason(){return null;}
    	public void setReason(String reason){}
    }

    public class InvalidInputException extends Exception {
    	public InvalidInputException(String reason){}
    	public String getReason(){return null;}
    	public void setReason(String reason){}
    }

    public class PublicationTypeExistsException extends Exception {
    	public PublicationTypeExistsException(String reason){}
    	public String getReason(){return null;}
    	public void setReason(String reason){}
    }
  }
