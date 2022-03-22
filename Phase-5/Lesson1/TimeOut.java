package com.selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeOut {

	public static void main(String[] args) {
		// set the driver property
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-3.5.0\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		driver.close();
	}
}