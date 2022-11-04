package com.w2a.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class TopNavigationLocators {

	
	
	@FindBy(css="#header-account-menu")
	public WebElement account;
	@FindAll({
		@FindBy(css="#header-account-signin-button"),
		@FindBy(xpath = "//*[contains(text(),'Sign In')]")
	})
	public WebElement signinBtn;
	
}
