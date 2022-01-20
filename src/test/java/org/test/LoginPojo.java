package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BassClass {
	// 1.default constracter

	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}

	// 2.Find And Declare the WebElements As Private
	@FindBy(id = "email")
	private WebElement txtEmail;

	@FindBy(id = "pass")
	private WebElement txtPass;

	@FindBy(name = "login")
	private WebElement btnLogin;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(WebElement txtEmail) {
		this.txtEmail = txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public void setTxtPass(WebElement txtPass) {
		this.txtPass = txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(WebElement btnLogin) {
		this.btnLogin = btnLogin;
	}

}
