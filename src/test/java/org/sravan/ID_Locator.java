package org.sravan;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ID_Locator {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\eclipse-workspace\\selenium-1\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver wd= new FirefoxDriver();	
		wd.get("https://formy-project.herokuapp.com/keypress");
		WebElement name=wd.findElement(By.id("name"));
		name.click();
		name.sendKeys("Sravan"); 
		WebElement button=wd.findElement(By.id("button"));
		button.click();
		wd.close();

	}

}
