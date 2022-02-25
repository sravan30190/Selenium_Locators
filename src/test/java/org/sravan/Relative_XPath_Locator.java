package org.sravan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Relative_XPath_Locator {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\eclipse-workspace\\selenium-1\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver wd= new FirefoxDriver();	
		wd.get("https://formy-project.herokuapp.com/checkbox");
		WebElement res=wd.findElement(By.xpath("//input[@id='checkbox-1']"));
		res.click();
		WebElement res1=wd.findElement(By.xpath("//input[@id='checkbox-3']"));
		res1.click();
		Thread.sleep(50000);
		wd.close();
		

	}

}
