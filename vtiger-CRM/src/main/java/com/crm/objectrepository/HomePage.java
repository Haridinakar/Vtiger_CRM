package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(linkText = "Calendar")
	private WebElement calanderLink;

	@FindBy(linkText = "Leads")
	private WebElement leadsLink;

	@FindBy(linkText = "Organizations")
	private WebElement organizationLink;

	@FindBy(linkText = "Contacts")
	private WebElement contactsLink;

	@FindBy(linkText = "Opportunities")
	private WebElement OpportunitiesLink;

	@FindBy(linkText = "Products")
	private WebElement productsLink;

	@FindBy(linkText = "Documents")
	private WebElement documentsLink;

	@FindBy(linkText = "Email")
	private WebElement emailLink;

	@FindBy(linkText = "Trouble Tickets")
	private WebElement troubleTicketLink;

	@FindBy(linkText = "Dashboard")
	private WebElement dashbordLink;

	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement profileButton;

	@FindBy(linkText = "Sign Out")
	private WebElement signoutLink;

	@FindBy(linkText = "CRM Settings")
	private WebElement crmSettingsLink;

	// initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// getterrs
	public WebElement getCalanderLink() {
		return calanderLink;
	}

	public WebElement getLeadsLink() {
		return leadsLink;
	}

	public WebElement getOrganizationLink() {
		return organizationLink;
	}

	public WebElement getContactsLink() {
		return contactsLink;
	}

	public WebElement getOpportunitiesLink() {
		return OpportunitiesLink;
	}

	public WebElement getProductsLink() {
		return productsLink;
	}

	public WebElement getDocumentsLink() {
		return documentsLink;
	}

	public WebElement getEmailLink() {
		return emailLink;
	}

	public WebElement getTroubleTicketLink() {
		return troubleTicketLink;
	}

	public WebElement getDashbordLink() {
		return dashbordLink;
	}

	public WebElement getProfileButton() {
		return profileButton;
	}

	public WebElement getCrmSettingsLink() {
		return crmSettingsLink;
	}

	public WebElement getSignoutLink() {
		return signoutLink;
	}

}
