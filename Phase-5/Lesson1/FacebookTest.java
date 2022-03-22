package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FacebookTest {
	public static void main(String[] args) {
        // set the driver property
        System.setProperty("webdriver.chrome.driver", "E:\\\\selenium-java-3.5.0\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.facebook.com/");
        
        WebElement email= driver.findElement(By.id("email"));
        WebElement pass= driver.findElement(By.id("pass"));
        
        email.sendKeys("sonam@gmail.com");
        pass.sendKeys("Sonam@1123");
        
        WebElement login= driver.findElement(By.name("login"));
        login.submit();
        //driver.close();
    }
}
