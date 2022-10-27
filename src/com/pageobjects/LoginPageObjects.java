package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	public WebDriver driver;

	By username = By.id("login1");
	By password = By.name("passwd");
	By submit = By.name("proceed");
	
	public LoginPageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void enterusername(String usernamevalue)
	{
		driver.findElement(username).sendKeys(usernamevalue);
	}
	
	public void clickonUsername()
	{
		driver.findElement(username).click();
	}
	
	public void enterpassword(String passwordValue)
	{
		driver.findElement(password).sendKeys(passwordValue);
	}
	
	public WebElement ClickonSubmit()
	{
		return driver.findElement(submit);
	}
	
}
