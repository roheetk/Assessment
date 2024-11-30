package stepdefinitions;

import io.cucumber.java.Before;
import utils.SeleniumDriver;

public class BeforeActions {

	@Before
	public void setUp() {
		SeleniumDriver.setUpDriver();
	}

}
