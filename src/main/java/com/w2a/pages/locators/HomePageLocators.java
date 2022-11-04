package com.w2a.pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class HomePageLocators {
	
	

	@FindBy(xpath = "//*[starts-with(@id,'tab-flight-tab')]")
	public WebElement flightTab;
	
	//locators for flight booking
	@FindBy(css = "input[id^='flight-origin']")
	public WebElement fromCity;
	@FindBy(css = "input[id^='flight-destination']")
	public WebElement toCity;
	@FindBy(css = "#flight-departing")
	public WebElement departFlight;
	@FindBy(css = "#flight-returning")
	public WebElement returnFlight;
	@FindBy(css = "#flight-adults")
	public WebElement adultCount;
	@FindBy(css = "#flight-children")
	public WebElement childCount;
	@FindBy(css = "button[type='submit']")
	public WebElement search;
	@FindBys({
		@FindBy(css = ".cols-nested.flight-date-fieldset.total-children-2"),
		@FindBy(id = "flight-age-select-1")
	})
	public WebElement firstAge;
	@FindAll({
		@FindBy(css = "#flight-age-select-222"),
		@FindBy(id = "flight-age-select-2")
	})
	
	public WebElement secondAge;
	@FindBy(css = "fieldset.cols-nested.flight-date-fieldset.total-children-2")
	public WebElement block;
	@FindBy(css="a[role='tab']")
	public List<WebElement> tabCount;


}
