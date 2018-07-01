package com.zonedigital.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zonedigital.qa.base.TestBase;

public class HomePage extends TestBase{
		
	@FindBy(name="q")
	WebElement searchBox;
	
	@FindBy(xpath="//button[@class='se-searchbox__submit']")
	WebElement searchClickButton;
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public String homePageTitleTest(){
		return driver.getTitle();
	}
	
	public SearchResultPage performSearchOperation(){
		searchBox.clear();
		searchBox.sendKeys(prop.getProperty("searchBox"));
		searchClickButton.click();
		return new SearchResultPage();
	}
}
