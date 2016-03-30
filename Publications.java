
import javax.security.auth.login.AccountNotFoundException;

/**
		* @author Sibusiso 12270467
		* @version 1.0
		*@since 2016-03-21
		*/

@interface
public interface Publications {

	/**
	 * This method returns the GetPublicationsForGroupResponse state (if any) which was assigned to the mock object. It is used by the
	 * {@link users e.g Administrator, Researcher } .
	 * 
	 * @return GetPublicationsForGroupResponse used by Administrator, Researcher object.
	 */
    public GetPublicationsForGroupResponse getPublicationsForGroup(GetPublicationsForGroupRequest getPublicationsForGroupRequest)throws AccountNotFoundException;  

}

  