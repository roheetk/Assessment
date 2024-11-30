package stepdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utils.SeleniumDriver;

public class AfterActions {
	@After
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			byte[] screenshotBytes = ((TakesScreenshot) SeleniumDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshotBytes, "image/png", "Screenshot");
		}
		/*
		 * if (SeleniumDriver.getDriver() != null) { SeleniumDriver.getDriver().close();
		 * }
		 */
		SeleniumDriver.tearDown();
	}
}
