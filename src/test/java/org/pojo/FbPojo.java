package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbPojo extends BaseClass {
	public FbPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement Email;

	@FindBy(id = "pass")
	private WebElement Pass;

	@FindBy(name = "login")
	private WebElement btnClk;

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPass() {
		return Pass;
	}

	public WebElement getBtnClk() {
		return btnClk;
	}

}
