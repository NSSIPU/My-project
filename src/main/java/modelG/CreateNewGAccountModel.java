package modelG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateNewGAccountModel extends BaseModelG {

	public CreateNewGAccountModel(WebDriver d) {
		super(d);
		
	}
	public WebElement getFirstname() {
		WebElement f= driver.findElement(By.xpath("//input[@name='firstName']"));
		return f;
		
	}		
	public WebElement getLastname() {
		WebElement l= driver.findElement(By.xpath("//input[@name='lastName']"));
		return l;
		
	}	
	

}
