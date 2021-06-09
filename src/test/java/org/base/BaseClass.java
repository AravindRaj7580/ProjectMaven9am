package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.sun.glass.events.KeyEvent;

public class BaseClass {
	WebDriver driver;
	public void getDriver() {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\MR\\eclipse-workspace\\MavenPractise\\Driver\\chromedriver.exe");
		  driver=new ChromeDriver();
		 
	}
	public void windowMaximize() {
          driver.manage().window().maximize();
	}
	public void launchUrl(String url) {
		driver.get(url);

	}
	public void typeText(WebElement element,String txt) {
		element.sendKeys(txt);

	}
	public void findElementById(String id) {
		WebElement findElement = driver.findElement(By.id(id));
        
	}
	public void buttonClick(WebElement element) {
		element.click();

	}
	public void closeWindow() {
		driver.close();

	}
	public void closeAllWindow() {
		driver.quit();

	}
	public void mousehoverAction(WebElement target) {
		Actions a=new Actions(driver);
		a.moveToElement(target).perform();
	}
	public void rightClick(WebElement target) {
		Actions a=new Actions(driver);
		a.contextClick(target).perform();

	}
    public void doubleClick(WebElement target) {
		Actions a=new Actions(driver);
		a.doubleClick(target).perform();

	}
    public void downArrowRobot() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

	}
    public void upArrowRobot() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);

	}
    public void enterButtonRobot() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
    public void dragAndDropActions(WebElement src,WebElement dest) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dest);

	}
    public void alertAccept() {
		Alert a = driver.switchTo().alert();
		a.accept();

	}
    public void alertDismiss() {
    	Alert a = driver.switchTo().alert();
		a.dismiss();
	}
    public void alertGetText() {
    	Alert a = driver.switchTo().alert();
		a.getText();
	}
    public void alertTypeText(String text) {
    	Alert a = driver.switchTo().alert();
		a.sendKeys(text);

	}
    public void takeScreenShotAs(String pathname) throws IOException {
		TakesScreenshot ak=(TakesScreenshot)driver;
		File src = ak.getScreenshotAs(OutputType.FILE);
		File dest=new File(pathname);
		FileUtils.copyFile(src, dest);
	}
    public void frameId(String id) {
		driver.switchTo().frame(id);
	}
    public void frameName(String name) {
		driver.switchTo().frame(name);

	}
    public void frameWebElement(WebElement element) {
		driver.switchTo().frame(element);
	}
    public void frameIndex(int num) {
		driver.switchTo().frame(num);

	}
    public void javaScriptExecutor(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','greens')", element);
	}
    public void javaScriptClick(WebElement element) {
    	JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}
    public void javaScriptGetAttribute(WebElement element) {
    	JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].getAttribute('value')", element);

	}
    public void ScrollDown(WebElement sDown) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", sDown);

	}
    public void ScrollUp(WebElement sDown) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", sDown);

	}
    public void selectByTextDropDown(WebElement element,String text) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
    public void selectByIndexDropDown(WebElement element,int num) {
		Select s=new Select(element);
		s.selectByIndex(num);

	}
    public void selectByValueDropDown(WebElement element,String text) {
		Select s=new Select(element);
		s.deselectByValue(text);

	}
    public void getOptionsDropDown(WebElement element) {
		Select s=new Select(element);
		s.getOptions();

	}
    public void getAllSelectedOptionsDropDown(WebElement element) {
		Select s=new Select(element);
		s.getAllSelectedOptions();

	}
    public void getFirstSelectedOptionDropDown(WebElement element) {
		Select s=new Select(element);
		s.getFirstSelectedOption();

	}
    public void isMultipleDropDown(WebElement element) {
		Select s=new Select(element);
		s.isMultiple();
		
	}
    public void deselectByIndex(WebElement element) {
		Select s=new Select(element);
		s.getAllSelectedOptions();
		

	}
    public void getFirstSelectedOptions(WebElement element) {
		Select s=new Select(element);
		s.getFirstSelectedOption();

	}
    
    
    
    
    
    
    
    
    
    
	
	
	

}
