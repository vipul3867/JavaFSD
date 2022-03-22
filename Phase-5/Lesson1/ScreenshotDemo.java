package com.selenium;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-3.5.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		

		WebElement query= driver.findElement(By.name("q"));
		query.sendKeys("What is selenium");
		
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File src =screenshot.getScreenshotAs(OutputType.FILE);
		
		try {
			FileHandler.copy(src, new File("E:\\selenium-java-3.5.0\\Screenshots\\output.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}