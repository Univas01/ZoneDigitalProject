package com.zonedigital.qa.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestUtil {
	
	public static long PAGE_LOAD_TIMEOUT = 5;
	public static long IMPLICIT_WAIT = 5;
	
	public static void scrollIntoView(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
    	js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
}
