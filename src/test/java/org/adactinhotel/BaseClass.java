package org.adactinhotel;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	static WebDriver driver;
	static WebElement element;

	public static void browserLaunch() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void launchUrl(String url) {
		driver.get(url);

	}
	
	
	public static void quitWindows() {
		driver.quit();
	}

	public void closeWindow() {
		driver.close();
	}

	public void clear(WebElement e) {
		e.clear();

	}

	public void fillTextBox(WebElement e, String value) {
		e.sendKeys(value);

	}

	public void getAttribute(WebElement e, String value) {
		
		System.out.println(e.getAttribute(value));
	}

	public void getText(WebElement e) {
		System.out.println(e.getText());
	}

	public void moveToElement(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
	}

	public void dragAndDrop(WebElement e, WebElement e1) {
		Actions a = new Actions(driver);
		a.dragAndDrop(e, e1).perform();
	}

	public void contextClick(WebElement e) {
		Actions a = new Actions(driver);
		a.contextClick(e);
	}

	public void doubleClick(WebElement e) {
		Actions a = new Actions(driver);
		a.doubleClick(e);

	}

	public void accept() {
		Alert a = driver.switchTo().alert();
		a.accept();

	}

	public void dismiss() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}

	public void sendKeys(String value) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(value);
	}

	public void getText() {
		Alert a = driver.switchTo().alert();
		a.getText();
	}

	public void click(WebElement e) {
		e.click();

	}

	public void selectByValue(WebElement e, String value) {
		Select s = new Select(e);
		s.selectByValue(value);
	}

	public void screenShot(WebElement e, String value) throws Exception {
		TakesScreenshot tk = (TakesScreenshot) driver;
		FileUtils.copyFile(tk.getScreenshotAs(OutputType.FILE), new File(value));
	
		
	}
	
	public void frames(WebElement e) {
		driver.switchTo().frame(e);
	}
}
