package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPage {
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement FirstNameTextField;

	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement LastNameTextField;

	@FindBy(xpath = "//input[@name='account_name']")
	private WebElement OrganizationNameTextField;

	@FindBy(id = "mobile")
	private WebElement MobileTextField;

	public CreateContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstNameTextField() {
		return FirstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return LastNameTextField;
	}

	public WebElement getOrganizationNameTextField() {
		return OrganizationNameTextField;
	}

	public WebElement getMobileTextField() {
		return MobileTextField;
	}

}
