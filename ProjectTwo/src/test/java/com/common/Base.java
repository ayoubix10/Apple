package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public WebDriver driver;
	// import webdriver

	public WebDriver getDriver() {
		// create a method getDriver
		WebDriverManager.chromedriver().setup();
		// setup chromerdriver
		driver = new ChromeDriver();
		// create new Object
		driver.get("https://www.apple.com/");
		// get method to launch web
		driver.manage().window().maximize();
		// to maximize windows
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// wait 30 seconds or more on the same page

		return driver;

	}

}
