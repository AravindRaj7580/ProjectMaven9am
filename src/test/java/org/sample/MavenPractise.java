package org.sample;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenPractise extends BaseClass{
	public static void main(String[] args) {
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/4.2.0");
	    driver.manage().window().maximize();
	    
	}

}
