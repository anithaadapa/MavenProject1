package com.listenersexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class Listener_WebDriverTest extends WebDriverListeners {
	
	public static WebDriver driver;
	
	@Test

	
	public void LoginTest()
	{
		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
		driver = new ChromeDriver();
		
		//Step 1 is to create an object for EventFiringWebDriver
		EventFiringWebDriver event = new EventFiringWebDriver(driver);
		
		//Step 2 create an object for your Listner class
		
		WebDriverListeners captureEvent = new WebDriverListeners();
		
		//step 3: is to register the listener for the class to generate the logs
		
		event.register(captureEvent);
	
		
		event.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		
		event.manage().window().maximize();
		
		event.findElement(By.id("login1")).sendKeys("Himanshu");
		
		event.close();
		
	}

}
