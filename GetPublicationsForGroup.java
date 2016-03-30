package com.codinginfinity.research.publication.defaultImpl;


/**
 * @author Sibusiso 12270467
 * @version 1.0
 *@since 2016-03-21
 */

public class GetPublicationsForGroup implements com.codinginfinity.research.publication.Publications{

    @Override
    public GetPublicationsForGroupResponse getPublicationsForGroup(GetPublicationsForGroupRequest getPublicationsForGroupRequest)throws AccountNotFoundException{

        /** Generate matching publication Objects requested by Person from the passed on parameter, if not found an exception to be thrown.
         *@throws new AccountNotFoundException("Not valid yet.");
         **/
        if(getPublicationsForGroupRequest!=null)
        {
            return new GetPublicationsForGroupResponse();
        }
        else
            throw new AccountNotFoundException("Publications not Found");

    }



    class GetPublicationsForGroupResponse {

        private  Publication GPubs = new Publication();


        //Default publication
        public boolean GetPublicationsForGroupResponse()
        {
            if((GPubs.addStateEntry(new PublicationState("In Progress", "10/10/10"))))
            {
                return true;
            }
            else
                return false;
        }
    }


}
