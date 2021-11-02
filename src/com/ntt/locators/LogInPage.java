package com.ntt.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends Base {

	public LogInPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getTxtmail() {
		return txtmail;
	}

	public WebElement getTstPwd() {
		return tstPwd;
	}

	public WebElement getBtn() {
		return btn;
	}

	@FindBy(id = "email")
	private WebElement txtmail;	 

	@FindBy(id = "pass")
	private WebElement tstPwd;

	@FindBy(xpath = "//button[@name='login']")
	private WebElement btn;

}
