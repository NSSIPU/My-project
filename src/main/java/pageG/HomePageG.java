package pageG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import modelG.HomeModelG;

public class HomePageG extends HomeModelG {

	public HomePageG(WebDriver d) {
		super (d);
	}
	//create a method to do the action (click on button):
		public void clickOnCreateAnAccBtn() {
			WebElement a = getCreateAnAccBtn();
			a.click();
			
		}
	

}
