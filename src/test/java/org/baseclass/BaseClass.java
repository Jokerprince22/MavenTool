package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass {
	public static WebDriver driver;

	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prince\\eclipse-workspace\\PrinceMaven\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

	}


	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void fillTxtBox(WebElement ele, String val) {

		ele.sendKeys(val);
	}

	public static void btnClick(WebElement element) {
		element.click();
	}

}
