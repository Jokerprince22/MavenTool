package org.test;

import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BassClass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert a1;
	public static JavascriptExecutor js;
	public static TakesScreenshot tk;
	public static Select s;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void maxBrowser() {
		driver.manage().window().maximize();

	}

	public static void loadUrl(String Url) {
		driver.get(Url);

	}

	public static void printTitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}

	public static void printCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void toText(WebElement element, String name) {
		element.sendKeys(name);
	}

	public static void btnClick(WebElement element) {
		element.click();
	}

	public static void printGetText(WebElement element, String name) {
		String text = element.getText();
		System.out.println(text);
	}

	public static void performMoveToElment(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element).perform();

	}

	public static  void performDragAndDrop(WebElement src, WebElement desc) {
		a.dragAndDrop(src, desc).perform();

	}

	public static void toPerformDoubleClick(WebElement element) {
		a.doubleClick(element).perform();
	}

	public static void toPerformRightClick(WebElement element) {
		a.contextClick(element).perform();
	}

	public static void toPerformEnter() {
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void toPerformDown() {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void toPerformSimpleAlert() {
		a1 = driver.switchTo().alert();
		a1.accept();
	}

	public static void toPerformConfirmAlert() {
		a1.dismiss();
	}

	public static void toPerformProptAlert(WebElement element, String text) {
		a1 = driver.switchTo().alert();
		a1.sendKeys(text);
	}

	public static void replaceSendkeys(WebElement element, String text) {
		js.executeScript("arguments[0].setAttribute('value','text')", element);

	}

	public static void replaceGetAttribute(WebElement element) {
		Object o = js.executeScript("argument[0].getAttribute('value')", element);
		String s = (String) o;
		System.out.println(s);

	}

	public static void replaceClick(WebElement element) {
		js.executeScript("argument[0].click()", element);
	}

	public static void toperformScreenShot() {
		tk = (TakesScreenshot) driver;
		File screenShot = tk.getScreenshotAs(OutputType.FILE);

	}

	public static void toPerformScrollDown(WebElement element) {
		js.executeScript("argument[0].ScrollIntoView('true')", element);

	}

	public static void tpPerformScrollUp(WebElement element) {
		js.executeScript("argument[0].ScrollIntoUp('false')", element);
	}

	public static void toPerformFrame(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void toPerformWindows(String text) {
		driver.switchTo().window(text);
	}

	public static void toPerformSelect(WebElement element, int a) {
		Select s = new Select(element);
		s.selectByIndex(a);

	}

	public static void sudden() {
		driver.quit();
	}

}
