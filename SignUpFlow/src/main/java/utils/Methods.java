package utils;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methods {
	public static WebDriver driver = SeleniumDriver.getDriver();

	public static String getRandomString() {
		String SALTCHARS = "abcdefghijklmonpqrstuvwxyz";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 5) {
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		return saltStr;
	}

	public static void waitForPageToLoad() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
	}

	public static void waitForElementToBeDisplayed(WebElement e) {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(e));
	}

}
