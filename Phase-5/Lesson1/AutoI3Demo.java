package com.selenium;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoI3Demo {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-3.5.0\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shine.com/registration/parser/");
		
		WebElement name=driver.findElement(By.cssSelector("#id_name"));
		name.sendKeys("Vipul Chinnawar");
		
		WebElement upload= driver.findElement(By.cssSelector("#id_file"));
		//clicking on upload button
		JavascriptExecutor executor= (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", upload);
		
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("E:\\selenium-java-3.5.0\\fileUploadRoutine.exe");
	}
}
