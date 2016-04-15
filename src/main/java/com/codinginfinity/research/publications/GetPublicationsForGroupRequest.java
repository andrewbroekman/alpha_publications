package com.codinginfinity.research.publications;

/**
 * @author Sibusiso 12270467
 * @version 1.0
 *@since 2016-03-21
 */

public class GetPublicationsForGroupRequest {
    //Default group publication req
    Publication PublicationGroupReq;
    
     public GetPublicationsForGroupResponse getPublicationsForGroup(GetPublicationsForGroupRequest getPublicationsForGroupRequest)throws NoSuchPublicationException{

        /** Generate matching publication Objects requested by Person/user from the passed on parameter, if not found an exception to be thrown.
         *@throws new AccountNotFoundException("Not valid yet.");
         **/
        if(getPublicationsForGroupRequest!=null)
         {
    return new GetPublicationsForGroupResponse();
         }
        else
            throw new NoSuchPublicationException();

    }
    
    
    
    
    
}
