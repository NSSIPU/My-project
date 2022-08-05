package modelG;

import org.openqa.selenium.WebDriver;

public class BaseModelG {

	//parent class:
		//in base modelG, only have the web driver:
		WebDriver driver;//instance variable, so need constructor:
		
		//we are going to initialize the variable by using constructor:
		public BaseModelG(WebDriver d) {
			driver=d;//invoke the driver
		}

}
