package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginGeneric {

	public static WebDriver driver;
	public void loginUrl()
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	   driver = new FirefoxDriver();
		driver.get("http://www.facebook.com/login.do");
	}

}
