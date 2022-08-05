package modelG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeModelG extends BaseModelG { 

	 

		//we know that if parent class has constructor, then we must create constructor 
		//in child class:
		public HomeModelG(WebDriver d) {
			super(d);// we call the parent class constructor using super keyword
			
			
		}
		public WebElement getCreateAnAccBtn() {
			WebElement createG= driver.findElement(By.xpath("//*[text()='Create an account']"));
			
				
			return createG;
		}
}
	

