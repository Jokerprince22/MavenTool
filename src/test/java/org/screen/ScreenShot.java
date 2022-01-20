package org.screen;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.test.BassClass;
import org.testng.xml.LaunchSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot extends BassClass {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		launchBrowser();
		loadUrl("https://chrome.google.com/webstore/category/extensions?hl=en");
		maxBrowser();
        toperformScreenShot();
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Prince\\eclipse-workspace\\PrinceMaven\\StoreShot\\Chrome.txt");
		FileUtils.copyFile(src, des);
		sudden();
	}

}
