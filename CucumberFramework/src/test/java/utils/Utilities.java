package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {
	
	 public WebDriver driver;

	public Utilities(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void waitForElementToAppear(By findBy) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));

	}
	
	public void waitForWebElementToAppear(WebElement findBy) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(findBy));

	}
	
	
	public void waitForElementToDisappear(WebElement ele) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.invisibilityOf(ele));

	}
	public void selectDropdownByIndex(WebElement dropdownelement, int index) {

		String currentMethodName = new Exception().getStackTrace()[0].getMethodName().toUpperCase();
//		logger.info(currentMethodName + " [" + dropdownelement.toString() + ", " + index + "]");

		Select dropdown = new Select(dropdownelement);
		dropdown.selectByIndex(index);

	}
	// Click on Select dropdown by text
		public List<WebElement> getselectDropdownOptions(WebElement dropdownelement) {

			String currentMethodName = new Exception().getStackTrace()[0].getMethodName().toUpperCase();
//			logger.info(currentMethodName + " [" + dropdownelement.toString() + ", ]");

			Select dropdown = new Select(dropdownelement);
			return dropdown.getOptions();

		}
	

	// Click on Select dropdown by text
	public static void selectDropdownByVisibleText(WebElement dropdownelement, String text) {

		String currentMethodName = new Exception().getStackTrace()[0].getMethodName().toUpperCase();
//		logger.info(currentMethodName + " [" + dropdownelement.toString() + ", " + text + "]");

		Select dropdown = new Select(dropdownelement);
		dropdown.selectByVisibleText(text);

	}

	// Click on Select dropdown by value
	public static void selectDropdownByValue(WebElement dropdownElement, String value) {

		String currentMethodName = new Exception().getStackTrace()[0].getMethodName().toUpperCase();
//		logger.info(currentMethodName + " [" + dropdownElement.toString() + ", " + value + "]");

		Select dropdown = new Select(dropdownElement);
		dropdown.selectByValue(value);

	}

	// Accept alert
	public static void acceptAlert(WebDriver driver) {

		String currentMethodName = new Exception().getStackTrace()[0].getMethodName().toUpperCase();
//		logger.info(currentMethodName);

		driver.switchTo().alert().accept();

	}

	// Dismiss alert
	public static void dismissAlert(WebDriver driver) {

		String currentMethodName = new Exception().getStackTrace()[0].getMethodName().toUpperCase();
//		logger.info(currentMethodName);

		driver.switchTo().alert().dismiss();

	}

	// Get Alert Text
	public static String getTextAlert(WebDriver driver) {

		String currentMethodName = new Exception().getStackTrace()[0].getMethodName().toUpperCase();
//		logger.info(currentMethodName);

		String name = driver.switchTo().alert().getText();

		return name;

	}
	public static Properties properties() throws IOException {
		 Properties prop = new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
					+ "//src//test//java//config//config.properties");
			prop.load(fis);
			return prop;
	}

}
