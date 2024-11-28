package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//	Declaration

	@FindBy(xpath = "//input[@type='text']")
	private WebElement usernameTextField;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordTextField;

	@FindBy(id = "submitButton")
	private WebElement loginButton;

//	Initialization

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//	Getters

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

}
