package scripts;

import org.openqa.selenium.WebDriver;

import pom.Loginpom;
import generic.LoginGeneric;

public class TestScript extends LoginGeneric {
	
	public static void main(String[] args) {
		LoginGeneric lg = new LoginGeneric();
		lg.loginUrl();
		//WebDriver driver = null;
		Loginpom lp = new Loginpom(driver);
		lp.setLogin("admin","manager");
		
	}

}
