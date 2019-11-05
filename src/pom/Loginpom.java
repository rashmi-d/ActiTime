package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpom {
	
	@FindBy(id="username")
	private WebElement un;
	
	@FindBy(name="pwd")
	private WebElement pass;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement clk;
	
	public Loginpom(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void setLogin(String user,String pwd)
	{
		un.sendKeys(user);
		pass.sendKeys(pwd);
		clk.click();
	}
}
