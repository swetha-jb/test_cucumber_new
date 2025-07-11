package pageObjects;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Utilities;

public class LandingPage {

	WebDriver driver;
	public LandingPage(WebDriver driver) {
		// initialization
		this.driver = driver;
	}
	// PageFactory
	
	By from = By.xpath("//input[@placeholder='From']");
	By to = By.xpath("//input[@id='toCity']");
	By frmval = By.xpath("//p[@class=\"font14 appendBottom5 blackText\"][0]");
	By indigocheck = By.xpath("//p[@class='checkboxTitle'][1]");

	
	
	//5-6
	
	public WebElement fromItem()
	{
		return driver.findElement(from);
		
		
	}
	
	public WebElement toItem()
	{
		return driver.findElement(to);
		
		
	}
	
	public void getSearchText()
	{
		driver.findElement(to).getText();
	}
	

}
