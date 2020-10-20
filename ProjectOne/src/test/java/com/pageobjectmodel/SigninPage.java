package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {

	WebDriver driver;

	public SigninPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@id='nav-link-accountList']")
	WebElement signin;

	public WebElement getSignin() {
		signin.click();
		return signin;
	}

	@FindBy(xpath = "//input[@id='ap_email']")
	WebElement email;

	public WebElement getemail() {
		email.sendKeys("msalahuddin221@gmail.com");
		return email;

	}
	
	@FindBy (xpath = "//input[@id=\"continue\"]")
	WebElement keepgoing;
	
	public WebElement clickconti () {
		keepgoing.click();
		return keepgoing;
		
	}
	
	@FindBy (xpath = "//input[@id=\"ap_password\"]")
	WebElement password;
	
	public WebElement inputpass() {
		password.sendKeys("66185664");
		return password;
		
	}
	
	@FindBy (xpath = "//input[@id=\"signInSubmit\"]")
	WebElement keepgoing1;
	
	public WebElement clickcontin () {
		keepgoing1.click();
		return keepgoing1;
	

}
	
}