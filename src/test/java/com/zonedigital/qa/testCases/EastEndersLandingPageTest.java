package com.zonedigital.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.zonedigital.qa.base.TestBase;
import com.zonedigital.qa.pages.EastEndersLandingPage;
import com.zonedigital.qa.pages.HomePage;
import com.zonedigital.qa.pages.SearchResultPage;
import com.zonedigital.qa.utilities.TestUtil;

public class EastEndersLandingPageTest extends TestBase {

	TestUtil testUtil;
	HomePage homePage;
	SearchResultPage searchResultPage;
	EastEndersLandingPage eastEndersLandingPage;

	public EastEndersLandingPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		homePage = new HomePage();
		searchResultPage = homePage.performSearchOperation();
		eastEndersLandingPage = searchResultPage.clickOnEastEndersSearchResult();
	}

	@Test
	public void verifyNextDateAndTimeTest() {

		String EastEndersPagetitle = eastEndersLandingPage.EastEndersPageTitle();
		Assert.assertEquals(EastEndersPagetitle, "BBC One - EastEnders");

		boolean flag = eastEndersLandingPage.verifyNextOnHeader();
		Assert.assertTrue(flag);

		String nextDate = eastEndersLandingPage.nextDate();
		String nextTime = eastEndersLandingPage.nextTime();
		System.out.println("Next EastEnders episode occurs on " + nextDate + ", which happens to be " + nextTime);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}