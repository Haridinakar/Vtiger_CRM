package com.crm.genericutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.crm.objectrepository.HomePage;
import com.crm.objectrepository.LoginPage;

public class BaseClass {
	public static WebDriver sdriver;
	public WebDriver driver;

	public static ExtentReports exereport;
	public static ExtentTest test;

	public Fileutility fUtil = new Fileutility();
	public Excelutility eUtil = new Excelutility();
	public Javautility jUtil = new Javautility();
	public Webdriverutlity wUtil = new Webdriverutlity();

	public LoginPage lp;
	public HomePage hp;

	@BeforeSuite
	public void reportConfiguration() {
		ExtentSparkReporter spark = new ExtentSparkReporter(
				"./HTML_report/ExtentReport" + jUtil.getsystemtime() + ".html");
		exereport = new ExtentReports();
		exereport.attachReporter(spark);
	}

	@Parameters("Browser")
	@BeforeClass
	public void launchBrowser(@Optional("chrome") String browserName) throws IOException {
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		sdriver = driver;
		wUtil.maximize(driver);
		wUtil.impWait(driver);

		driver.get(fUtil.getDataFromProperty("url"));
	}

	@BeforeMethod
	public void login() throws IOException {
		lp = new LoginPage(driver);
		lp.getUsernameTextField().sendKeys(fUtil.getDataFromProperty("username"));
		lp.getPasswordTextField().sendKeys(fUtil.getDataFromProperty("password"));
		lp.getLoginButton().click();
	}

	@AfterMethod
	public void logOut() {
		hp = new HomePage(driver);
		wUtil.mouseHover(driver, hp.getProfileButton());
		hp.getSignoutLink().click();
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

	@AfterSuite
	public void reportBackup() {
		exereport.flush();
	}

}
