
/**
 * @author Sibusiso 12270467
 * @version 1.0
 *@since 2016-03-21
 */

Public class PublicationsForGroupTest{
	
	private Publications  _Pubs= null; 
        private getPublicationsForGroupRequest _PGR = null;
	
	
	@Before
	 public void SettingUpTest()
		{
		  _Pubs = new GetPublicationsForGroup();
          _PGR = new getPublicationsForGroupRequest();
		
		}
	
	@Test
    public void
		DefaultPublicationsforGroupRequest()
		  {
		       _Pubs.getPublicationsForGroup(_PGR); 	   
		       assertFalse("PublicationsRequestForGroup Printed", );    
		  }


	@Test
	public void EmptyPublicationsforGroupRequest(){

		_PGR=null;
		_Pubs.getPublicationsForGroup(_PGR);
		assertFalse("Publications not found");
	}


}