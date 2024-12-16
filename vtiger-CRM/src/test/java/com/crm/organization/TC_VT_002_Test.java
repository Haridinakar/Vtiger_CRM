package com.crm.organization;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.crm.genericutility.BaseClass;
import com.crm.genericutility.ListenerUtility;
import com.crm.objectrepository.CreateOrganizationPage;
import com.crm.objectrepository.HomePage;
import com.crm.objectrepository.organizationPage;

@Listeners(ListenerUtility.class)
public class TC_VT_002_Test extends BaseClass implements ITestListener {
	@Test
	public void createOrganization() throws EncryptedDocumentException, IOException {
		hp = new HomePage(driver);
		hp.getOrganizationLink().click();

		organizationPage op = new organizationPage(driver);
		op.getCreateOrganizationButton().click();

		CreateOrganizationPage cop = new CreateOrganizationPage(driver);
		Assert.assertTrue(cop.getOrganizationNameTextField().isDisplayed(), "CreateOrganization Page is not displayed");
		test.log(Status.PASS, "CreateOrganization Page is displayed");

		String Orgname = eUtil.getStrDatafromExcel("Organizations", 1, 0) + jUtil.getRandomnum();

		cop.getOrganizationNameTextField().sendKeys(Orgname);
		cop.getSaveButton().click();

		String headerText = cop.getOrganizationHeaderText().getText();
		System.out.println(headerText);

		Assert.assertTrue(headerText.contains(Orgname), "Orgname Is not Created");
		test.log(Status.PASS, "Orgname Is Created");
	}

}
