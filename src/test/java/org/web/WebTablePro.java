package org.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablePro {
public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
driver.manage().window().maximize();
WebElement firstTable = driver.findElement(By.id("customers"));
List<WebElement> allRow = firstTable.findElements(By.tagName("td"));
for (int i = 0; i < allRow.size(); i++) {
	WebElement row = allRow.get(i);
	System.out.println(row.getText());
	if (row.equals("Astria")) {
		System.out.println();
		
	}
	
}
}
	}
	
	












