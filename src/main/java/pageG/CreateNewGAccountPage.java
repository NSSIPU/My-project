package pageG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import modelG.CreateNewGAccountModel;

public class CreateNewGAccountPage extends CreateNewGAccountModel{

	public CreateNewGAccountPage(WebDriver d) {
		super(d);
		
	}
	public void typeFirstName(String first) {
		WebElement f = getFirstname();
		f.sendKeys(first);
		
	}
	public void typeLastName(String last) {
		WebElement l = getLastname();
		l.sendKeys(last);
		
	}
	
	
	

}
