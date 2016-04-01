package com.codinginfinity.research.publication;


/**
 *
 * A class showing how Publications for group requests and responses will be handled.
 * @author Sibusiso 12270467
 * @version 1.0
 *@since 2016-03-21
 */

public class GetPublicationsForGroup implements Publications{

    @Override
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

    @Override
    public ChangePublicationStateResponse changePublicationState(ChangePublicationStateRequest changePublicationStateRequest) {
        return null;
    }

}
