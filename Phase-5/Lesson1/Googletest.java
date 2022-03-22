package com.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class Googletest{
	//set the driver property
	public static void main (String args[])
	{
    System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-3.5.0\\chromedriver.exe");
    
    WebDriver driver= new ChromeDriver();
    //for firefox users
    //WebDriver driver=new FirefoxDriver();
    driver.get("https://www.google.co.in/");
    
    String expected="Google";
    String actual= driver.getTitle();
    
    if(expected.equals(actual))
        System.out.println("Test Passed..!!");
    else
        System.out.println("Test failed");
    
    driver.close();
}
}
