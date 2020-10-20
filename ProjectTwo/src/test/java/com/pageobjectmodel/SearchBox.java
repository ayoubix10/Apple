package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBox {
	
	WebDriver driver;
	
	public SearchBox (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[@id=\"ac-gn-link-search\"]")
	WebElement Search;

	public WebElement AppleSearch() {
		Search.click();
		return Search;
		
	}
	@FindBy(xpath = "//input[@id=\"ac-gn-searchform-input\"]")
	WebElement EnterSearch;
	
	public WebElement macsearch() {
		EnterSearch.submit();
		return EnterSearch;
		
		
	}
	
	
}

