package utils;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDriver {

	private static WebDriver driver;
	private static SeleniumDriver seleniumDriver;

	public static WebDriver getDriver() {
		return driver;
	}

	private SeleniumDriver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public static void setUpDriver() {
		if (seleniumDriver == null) {
			seleniumDriver = new SeleniumDriver();
		}
	}

	public static void tearDown() {
		if (driver != null) {
			driver.quit();
			seleniumDriver = null;
		}
	}
}
