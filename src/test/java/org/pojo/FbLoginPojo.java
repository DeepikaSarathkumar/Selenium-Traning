package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPojo extends BaseClass {

	// Non Parameterized Constructors
	public FbLoginPojo() {
		PageFactory.initElements(driver, this);
	}

	// 2.Private WebElements
	// webElement email = driver.findElement(By.id("email"));

	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;

	@FindBy(xpath = "//input[@aria-label='Password']")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement login;

	// 3.Getters to access webElements outside the class
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

}
