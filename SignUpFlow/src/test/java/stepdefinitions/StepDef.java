package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages_actions.PageActions;
import utils.SeleniumDriver;

public class StepDef {
	PageActions pageActions = new PageActions();

	@Given("User navigates to software testing board website {string}")
	public void user_navigates_to_software_testing_board_website(String websiteURL) throws Throwable {
		SeleniumDriver.getDriver().get(websiteURL);
	}

	@When("User clicks {string} link")
	public void user_clicks_link(String link) {
		pageActions.clickOnHeaderLinkCreateAccount(link);
	}

	@And("Adds {string}")
	public void adds(String fieldName) {
		pageActions.enterInField(fieldName);
	}

	@And("Adds user id {string}")
	public void adds_user_id(String fieldName) {
		pageActions.enterUserId(fieldName);
	}

	@And("Signs in")
	public void signs_in() {
		pageActions.clickBtnSignIn();
	}

	@And("Clicks button {string}")
	public void clicks_button(String btnName) {
		pageActions.clickOnButton(btnName);
	}

	@When("User logs out")
	public void user_logs_out() {
		pageActions.clickOnDownArrow();
	}

	@Then("User should see the text {string}")
	public void user_should_be_logged_in(String text) {
		pageActions.verifyText(text);
	}
}
