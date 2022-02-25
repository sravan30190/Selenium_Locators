package org.sravan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClassName_Locator 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\eclipse-workspace\\selenium-1\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver wd= new FirefoxDriver();	
		wd.get("https://formy-project.herokuapp.com/scroll");
		WebElement cls=wd.findElement(By.className("form-control"));
		Actions act=new Actions(wd);
		act.moveToElement(cls);
		cls.sendKeys("Sravan");
		WebElement date=wd.findElement(By.id("date"));
		date.sendKeys("24/02/2022");
		Thread.sleep(5000);
		wd.close();
		
	}
}
