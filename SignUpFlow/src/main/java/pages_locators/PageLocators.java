package pages_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utils.SeleniumDriver;

public class PageLocators {
	public static WebDriver driver = SeleniumDriver.getDriver();

	public static WebElement lnkHeader(String link) {
		WebElement e = driver
				.findElement(By.xpath("//div[@class='panel header']//a[normalize-space()='" + link + "']"));
		return e;
	}

	public static WebElement ele(String f) {
		WebElement e = driver.findElement(By.xpath("//*[@title='" + f + "']"));
		return e;
	}

	public static WebElement text(String t) {
		WebElement e = driver.findElement(By.xpath("(//*[contains(text(),'" + t + "')])[1]"));
		return e;
	}

	@FindBy(how = How.XPATH, using = "//div[@class='panel header'] //button[@data-action='customer-menu-toggle']")
	public static WebElement arrow;

	@FindBy(how = How.XPATH, using = "//div[@class='panel header'] //button[@data-action='customer-menu-toggle']/../following-sibling::div//li[@class='authorization-link']")
	public static WebElement signOut;

	@FindBy(how = How.XPATH, using = "//button[@class='action login primary']")
	public static WebElement btnSignIn;

}