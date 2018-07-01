package com.zonedigital.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zonedigital.qa.base.TestBase;

public class EastEndersLandingPage extends TestBase {
	
	@FindBy(xpath="//h2[contains(text(),'Next on')]")
	WebElement NextOnHeader;
	
	@FindBy(xpath="//div[@class='map-grid__column-wrap 1/1']/div[2]/descendant::a[1]")
	WebElement NextOnDate;
	
	@FindBy(xpath="//div[@class='map-grid__column-wrap 1/1']/div[2]/descendant::div[@class='media__details br-box-secondary']/div/child::*")
	WebElement NextOnTime;
	
	public EastEndersLandingPage(){
		PageFactory.initElements(driver, this);
	}

	public String EastEndersPageTitle(){
		return driver.getTitle();
	}
	
	public boolean verifyNextOnHeader(){
		return NextOnHeader.isDisplayed();		
	}
	
	public String nextDate(){
		return NextOnDate.getText();
	}
	
	public String nextTime(){
		return NextOnTime.getText();
	}
}
