package org.sravan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkText_Locator 
{

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\eclipse-workspace\\selenium-1\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver wd= new FirefoxDriver();	
		wd.navigate().to("https://www.testandquiz.com/selenium/testing.html");   
		wd.findElement(By.linkText("This is a Link")).click();  
	}

}
