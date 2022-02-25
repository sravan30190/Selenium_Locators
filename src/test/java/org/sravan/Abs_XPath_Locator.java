package org.sravan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Abs_XPath_Locator {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\eclipse-workspace\\selenium-1\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver wd= new FirefoxDriver();	
		wd.get("https://formy-project.herokuapp.com/datepicker");
		WebElement abs=wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		abs.click();
		abs.sendKeys("02/25/2022");
		Thread.sleep(5000);
		wd.close();

	}

}
