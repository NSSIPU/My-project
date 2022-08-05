package testG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import pageG.CreateNewGAccountPage;
import pageG.HomePageG;

public class BaseTestG {

	static WebDriver driver;
	static HomePageG homePageG;
	static CreateNewGAccountPage createNewGAccountPage;
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/sipusaha/Downloads/chromedriver");
		driver= new ChromeDriver();
		driver.get("https://www.google.com/account/about/");
		
	}
	public HomePageG getHomePageG () {
		homePageG = new HomePageG(driver);
		return homePageG;
		
	}
	public CreateNewGAccountPage getCreateNewGAccountPage () {
		createNewGAccountPage = new CreateNewGAccountPage(driver);
		return createNewGAccountPage;
	}
	

}
