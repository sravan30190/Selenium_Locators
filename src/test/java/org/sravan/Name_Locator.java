package org.sravan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Name_Locator {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\eclipse-workspace\\selenium-1\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver wd= new FirefoxDriver();	
		wd.get("https://twitter.com/i/flow/login");
		WebElement name=wd.findElement(By.name("text"));
		name.click();
		name.sendKeys("sravan30190");
		wd.close();
	}

}
