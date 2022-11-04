package com.w2a.pages.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.w2a.base.Page;
import com.w2a.pages.locators.HomePageLocators;

public class HomePage extends Page {
	
	public HomePageLocators home;
	

	public HomePage(){
		
		this.home = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.home);
		
	}
	
	
	public HomePage gotoFlights(){
		
		click(home.flightTab);
		
		return this;
	}
	
	

	public void gotoHotels(){
		
		
	}
	
	public void gotoFlightAndHotels(){
		
		
	}
	
	public int findTabCount(){
		
		return home.tabCount.size();
	}
	
	
	public void bookAFlight(String from, String to, String departing, String returning,
			String noOfAdults,String noOfChildern){
		
		
		type(home.fromCity,from);
		type(home.toCity,to);
		
		type(home.departFlight,departing);
		type(home.returnFlight,returning);
		type(home.adultCount,noOfAdults);
		type(home.childCount,noOfChildern);
		type(home.firstAge,noOfAdults);
		type(home.secondAge,noOfChildern);
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).perform();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		home.block.click();
		action.sendKeys(Keys.PAGE_DOWN).perform();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(home.search);
		
	}
	
	
	

}
