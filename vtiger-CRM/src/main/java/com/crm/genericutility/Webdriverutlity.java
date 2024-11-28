package com.crm.genericutility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webdriverutlity {
	/**
	 * This method perform mouse hover action webelement
	 * 
	 * @param driver
	 * @param element
	 */
	public void mouseHover(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	/**
	 * This method perform rightclick action
	 * 
	 * @param driver
	 */

	public void rightClick(WebDriver driver) {
		Actions act = new Actions(driver);
		act.contextClick().perform();
	}

	/**
	 * This method perform scrolling action webelement
	 * 
	 * @param driver
	 * @param element
	 */
	public void scrolling(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.scrollToElement(element).perform();
	}

	/**
	 * This method perform scrolling by amount within x and y
	 * 
	 * @param driver
	 * @param x
	 * @param y
	 */

	public void scrolling(WebDriver driver, int x, int y) {
		Actions act = new Actions(driver);
		act.scrollByAmount(x, y).perform();
	}

	/**
	 * This method perform drag and drop from source to target
	 * 
	 * @param driver
	 * @param element
	 */
	public void dragAndDrop(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.dragAndDrop(element, element);
	}

	/**
	 * This method is used to Switch frame window based on index value
	 * 
	 * @param driver
	 * @param index
	 */
	public void switchToWindow(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	/**
	 * This method is used to Switch frame window based on String nameOrId
	 * 
	 * @param driver
	 * @param nameOrId
	 */
	public void switchToWindow(WebDriver driver, String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}

	/**
	 * This method is used to Switch frame window based on Webelement
	 * 
	 * @param driver
	 * @param frameElement
	 */
	public void switchToWindow(WebDriver driver, WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}

	/**
	 * This method used to click on webelement using javascriptexecutor
	 * 
	 * @param driver
	 * @param element
	 */
	public void jsClick(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click", element);
	}

	/**
	 * This method used to Scroll the webpage using with x and y value in
	 * javascriptexecutor
	 * 
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void jsScroll(WebDriver driver, int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + ", " + y + ")");
	}

	/**
	 * This method is used to switchTo Alert the window
	 * 
	 * @param driver
	 * @return
	 */
	public Alert switchToAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}

	/**
	 * This method is used to switchTo Alert the window and accept it
	 * 
	 * @param driver
	 */
	public void switchToAlertAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	/**
	 * This method is used to switchTo Alert the window and dismiss it
	 * 
	 * @param driver
	 */
	public void switchToAlertDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	/**
	 * This method is used to switchTo Alert the window and Send Datato textfield
	 * 
	 * @param driver
	 * @param data
	 */
	public void switchToAlertSendData(WebDriver driver, String data) {
		driver.switchTo().alert().sendKeys(data);
	}

	/**
	 * This Method is used to gettext from Popup
	 * 
	 * @param driver
	 * @return
	 */
	public String switchToAlertGetText(WebDriver driver) {
		return driver.switchTo().alert().getText();
	}

	/**
	 * This method Used to select options based on index value
	 * 
	 * @param element
	 * @param index
	 */
	public void selectDropDown(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	/**
	 * This method used to Select the options based on value
	 * 
	 * @param element
	 * @param value
	 */
	public void selectDropDown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	/**
	 * This method used to Select the options based on visibleText
	 * 
	 * @param element
	 * @param visibileText
	 */
	public void selectByVisibleText(WebElement element, String visibileText) {
		Select select = new Select(element);
		select.selectByVisibleText(visibileText);
	}

	/**
	 * This method is used to Switch the driver control to next window
	 * 
	 * @param driver
	 */

	public void switchTo(WebDriver driver) {
		Set<String> allwindowHandles = driver.getWindowHandles();
		for (String ids : allwindowHandles) {
			driver.switchTo().window(ids);
			String Url = driver.getCurrentUrl();
			if (Url.contains(ids)) {
				break;
			}
		}
	}

	/**
	 * This method is used to Get all options in listbox
	 * 
	 * @param driver
	 * @param element
	 */
	public void getAlloptions(WebDriver driver, WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		for (WebElement Allopt : options) {
			System.out.println(Allopt);
		}
	}

	/**
	 * This method is used to takesscreenshots
	 * 
	 * @param driver
	 * @return
	 * @throws IOException
	 */
	public File TakesScreenshots(WebDriver driver) throws IOException {
		String time = LocalDateTime.now().toString().replace(":", "-");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/" + time + "/Ss.png");
		FileHandler.copy(temp, dest);
		return dest;
	}

	/**
	 * This method is used to Maximize the window
	 * 
	 * @param driver
	 */
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}

	/**
	 * This method is used to Navigateback the window
	 * 
	 * @param driver
	 */
	public void navigateBack(WebDriver driver) {
		driver.navigate().back();
	}

	/**
	 * This method is used to navigateForward the window
	 * 
	 * @param driver
	 */
	public void navigateForward(WebDriver driver) {
		driver.navigate().forward();
	}

	/**
	 * This method is used to Refresh the window
	 * 
	 * @param driver
	 */
	public void reFresh(WebDriver driver) {
		driver.navigate().refresh();
	}

	/**
	 * This method is used to Scrolltill the bottom to the webpage
	 * 
	 * @param driver
	 */
	public void scrollTotillBottom(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document,body.scrollHeight)");

	}

	/**
	 * This method is used to find the color of the webelement
	 * 
	 * @param driver
	 * @param Xpath
	 * @param color
	 */
	public void getColor(WebDriver driver, String Xpath, String color) {
		String cssValue = driver.findElement(By.xpath("Xpath")).getCssValue("color");
		System.out.println(cssValue);
	}

	/**
	 * This method is used to close the window
	 * 
	 * @param driver
	 */
	public void closeWindow(WebDriver driver) {
		driver.quit();
	}

	/**
	 * This method is used to set implicit wait
	 * 
	 * @param driver
	 * @param sec
	 */
	public void impWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	/**
	 * This method is used to set explicit wait
	 * 
	 * @param driver
	 * @param xPath
	 * @param sec
	 */
	public void expWait(WebDriver driver, String xPath, int sec) {
		WebElement element = driver.findElement(By.xpath("xPath"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

}
