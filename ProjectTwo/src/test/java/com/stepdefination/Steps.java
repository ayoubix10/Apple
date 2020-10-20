package com.stepdefination;

import org.openqa.selenium.support.PageFactory;

import com.common.Base;
import com.pageobjectmodel.SearchBox;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps extends Base {
	
	SearchBox sb;
	
	@Given("^The user is on Apple homepage$")
	public void the_user_is_on_Apple_homepage() throws Throwable {
		getDriver();
		
		sb = PageFactory.initElements(driver, SearchBox.class);
 
 
	}

	@When("^the user looks up mac$")
	public void the_user_looks_up_mac() throws Throwable {
		
    sb.AppleSearch();
 
	}

	@When("^enters search button$")
	public void enters_search_button() throws Throwable {
		
		sb.macsearch();
		
		
 
 
	}

	@Then("^the user is able to view product info$")
	public void the_user_is_able_to_view_product_info() throws Throwable {
 
 
	}

	@When("^the user looks up air pods$")
	public void the_user_looks_up_air_pods() throws Throwable {

 
	}

}
