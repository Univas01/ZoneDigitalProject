package com.zonedigital.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.zonedigital.qa.utilities.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/zonedigital/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");
		String osName = System.getProperty("os.name");

		if (osName.startsWith("Windows")) {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "/browsers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("FF")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "/browsers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
		} else if (osName.startsWith("Mac")) {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "/browsers/chromedriver");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("FF")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/browsers/geckodriver");
				driver = new FirefoxDriver();
			}
		} else if (osName.startsWith("Linux")) {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "/browsers/chromedriver");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("FF")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/browsers/geckodriver");
				driver = new FirefoxDriver();
			}
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
	}
}