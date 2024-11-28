package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

	@FindBy(xpath = "//img[@alt='Create Contact...']")
	private WebElement createcontactButton;

	@FindBy(xpath = "//img[@alt='Search in Contacts...']")
	private WebElement searchContactButton;

	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreatecontactButton() {
		return createcontactButton;
	}

	public WebElement getSearchContactButton() {
		return searchContactButton;
	}

}
