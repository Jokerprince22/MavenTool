package com.script;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class JavaStript {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", login);
	WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	js.executeScript("arguments[0].setAttribute('value','Prince')", user);
	WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	js.executeScript("arguments[0].setAttribute('value','Raja')", pass);
	WebElement login1 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	js.executeScript("arguments[0].click()", login1);
	
	Object print = js.executeScript("return arguments[0].getAttribute('value')", user);
	System.out.println(print);
	String s=(String)print;
	System.out.println(s);
	driver.quit();
	
	
	
	
}
}
