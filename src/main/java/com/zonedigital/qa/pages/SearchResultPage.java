package com.zonedigital.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zonedigital.qa.base.TestBase;
import com.zonedigital.qa.utilities.TestUtil;

public class SearchResultPage extends TestBase{
	
	@FindBy(xpath="//h1[@itemprop='headline']/a[contains(text(), 'EastEnders')]")
	WebElement EastEndersLink;
	
	public SearchResultPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateSearchResultPage(){
		return driver.getTitle();
	}
	
	public EastEndersLandingPage clickOnEastEndersSearchResult() {
		TestUtil.scrollIntoView(EastEndersLink, driver);
		EastEndersLink.click();
		return new EastEndersLandingPage();
	}
	
}
