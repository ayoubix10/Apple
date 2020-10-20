package com.stepdefination;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.Base;
import com.pageobjectmodel.SigninPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends Base {

	SigninPage sp;

	@Given("^user is on Amazon homepage$")
	public void user_is_on_Amazon_homepage() throws Throwable {

		getDriver();

		sp = PageFactory.initElements(driver, SigninPage.class);

	}

	@When("^user able to click sign in button$")
	public void user_able_to_click_sign_in_button() throws Throwable {
		

		sp.getSignin();

	}

	@When("^user is able to enter email$")
	public void user_is_able_to_enter_email() throws Throwable {
		
			sp.getemail();

	}

	@When("^user is able to click continue$")
	public void user_is_able_to_click_continue() throws Throwable {
		
		sp.clickconti();

	}

	@When("^user is able to input password$")
	public void user_is_able_to_input_password() throws Throwable {
		
		sp.inputpass();

	}

	@When("^user is able to click signin button$")
	public void user_is_able_to_click_signin_button() throws Throwable {
		
		sp.clickcontin();

	}

	@Then("^the user is able to view his account successfully$")
	public void the_user_is_able_to_view_his_account_successfully() throws Throwable {

		Assert.assertEquals(driver.getTitle(), "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
	
		System.out.println(driver.getTitle());
		
	}

	
}
