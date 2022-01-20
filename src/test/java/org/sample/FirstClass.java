package org.sample;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.pojo.FbPojo;

public class FirstClass extends BaseClass {
	public static void main(String[] args) {

		launchBrowser();
		launchUrl("http://demo.guru99.com/test/drag_drop.html");
		FbPojo p=new FbPojo();
		fillTxtBox(p.getEmail(), "grens");
		fillTxtBox(p.getPass(), "4567");
		WebElement btn = p.getBtnClk();
		btn.click();
		
		
		
	}
}
