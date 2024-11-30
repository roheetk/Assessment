package pages_actions;

import org.openqa.selenium.support.PageFactory;
import pages_locators.PageLocators;
import utils.Methods;
import utils.SeleniumDriver;

public class PageActions {
	PageLocators pageLocators = null;
	String email;
	String value;

	public PageActions() {
		this.pageLocators = new PageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), pageLocators);
	}

	public void clickOnHeaderLinkCreateAccount(String link) {
		Methods.waitForElementToBeDisplayed(PageLocators.lnkHeader(link));
		PageLocators.lnkHeader(link).click();
	}

	public void clickOnButton(String btn) {
		PageLocators.ele(btn).click();
	}

	public void clickBtnSignIn() {
		PageLocators.btnSignIn.click();
	}

	public void clickOnDownArrow() {
		PageLocators.arrow.click();
		PageLocators.signOut.click();
		Methods.waitForPageToLoad();
	}

	public void verifyText(String txt) {
		Methods.waitForPageToLoad();
		PageLocators.text(txt).isDisplayed();
	}

	public void enterInField(String fName) {
		value = Methods.getRandomString();
		if (fName.contains("Name")) {
			PageLocators.ele(fName).sendKeys("A" + value);
		} else if (fName.contains("Email")) {
			email = value + "@yopmail.com";
			PageLocators.ele(fName).sendKeys(email);
		} else if (fName.contains("Password")) {
			PageLocators.ele(fName).sendKeys("Testeng@123");
		}
	}

	public void enterUserId(String fName) {
		PageLocators.ele(fName).sendKeys(email);
	}
}
