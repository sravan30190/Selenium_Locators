package org.sravan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector_Locator {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\eclipse-workspace\\selenium-1\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver wd= new FirefoxDriver();	
		wd.get("https://formy-project.herokuapp.com/modal");
		WebElement css=wd.findElement(By.cssSelector("#modal-button"));
		css.click();
		Thread.sleep(5000);
		wd.close();
		
	}

}
