package testG;

import org.testng.annotations.Test;

public class CreateNewGAccountPageTest extends BaseTestG {

	@Test
	public void CreateNewGAccountPageTest () {
		//we need the first page step to click on create account:
		getHomePageG();
		homePageG.clickOnCreateAnAccBtn();
		
		//Working on Second page:
		getCreateNewGAccountPage ();
		
		String firstname="rabiul";
		String lastname="hassan";
		
		createNewGAccountPage.typeFirstName(firstname);
		createNewGAccountPage.typeLastName(lastname);
		
	}

	
	
}
