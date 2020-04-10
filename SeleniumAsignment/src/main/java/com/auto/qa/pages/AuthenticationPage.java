package com.auto.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.auto.qa.constant.GenericConstant;

/**
 * @author Prince Khanna
 *
 */
public class AuthenticationPage {
	/**
	 * Web Elements for this Page
	 */
	@FindBy(how = How.XPATH, using = "//button[@id='SubmitCreate']")
	WebElement creatAccountBtn;
	@FindBy(how = How.XPATH, using = "//input[@id='email_create']")
	WebElement newEmail;

	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement existingEmail;
	@FindBy(how = How.XPATH, using = "//input[@id='passwd']")
	WebElement password;
	@FindBy(how = How.XPATH, using = "//button[@id='SubmitLogin']")
	WebElement signInButton;

	@FindBy(how = How.XPATH, using = "//div[@id = 'create_account_error']")
	WebElement errorMessage;

	/**
	 * Method for creation of account
	 */
	public void createAccount() {
			creatAccountBtn.click();	
	}

	/**
	 * Method for Entering of Email ID
	 */
	public void enterEmail() {
		newEmail.sendKeys(GenericConstant.EMAIL);
	}

	/**
	 * Method to Enter the created email id
	 */
	public void existingEmail() {
		existingEmail.sendKeys(GenericConstant.EMAIL);
	}

	/**
	 * Method to add the password
	 */
	public void password() {
		password.sendKeys(GenericConstant.PASSWORD);
	}

	/**
	 * Method to click submit button
	 */
	public void submitAccount() {
		signInButton.click();
	}

	
}
