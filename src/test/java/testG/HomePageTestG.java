package testG;

import org.testng.annotations.Test;

public class HomePageTestG extends BaseTestG {

	@Test
	public void homePageTestG() {
		getHomePageG();
		homePageG.clickOnCreateAnAccBtn();
	}
}
