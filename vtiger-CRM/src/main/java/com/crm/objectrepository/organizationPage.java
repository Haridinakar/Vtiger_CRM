package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class organizationPage {
	@FindBy(xpath = "//img[@alt='Create Organization...']")
	private WebElement createOrganizationButton;

	@FindBy(xpath = "//img[@alt='Search in Organizations...']")
	private WebElement searchOrganizationButton;

	public organizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateOrganizationButton() {
		return createOrganizationButton;
	}

	public WebElement getSearchOrganizationButton() {
		return searchOrganizationButton;
	}

}
