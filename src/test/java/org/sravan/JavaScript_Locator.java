package org.sravan;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScript_Locator 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\eclipse-workspace\\selenium-1\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver wd= new FirefoxDriver();	
		wd.get("https://formy-project.herokuapp.com/modal");
		JavascriptExecutor js = (JavascriptExecutor)wd;
		WebElement bt=wd.findElement(By.id("modal-button"));
		bt.click();
		//wd.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement clbtn=wd.findElement(By.id("close-button"));
		js.executeScript("arguments[0].click();",clbtn);
		Thread.sleep(50000);
		wd.close();
	}

}
