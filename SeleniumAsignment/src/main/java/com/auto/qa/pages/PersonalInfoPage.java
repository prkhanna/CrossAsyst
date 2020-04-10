package com.auto.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.auto.qa.constant.GenericConstant;

/**
 * @author Prince Khanna
 *
 */
public class PersonalInfoPage {

	/**
	 * Web Elements for this Page
	 */
	@FindBy(how = How.XPATH, using = "//input[@id = 'id_gender1']")
	WebElement titleRadio;
	@FindBy(how = How.XPATH, using = "//input[@id = 'customer_firstname']")
	WebElement firstName;
	@FindBy(how = How.XPATH, using = "//input[@id = 'customer_lastname']")
	WebElement lastName;
	@FindBy(how = How.XPATH, using = "//input[@id = 'email']")
	WebElement email;
	@FindBy(how = How.XPATH, using = "//input[@id = 'passwd']")
	WebElement password;

	@FindBy(how = How.XPATH, using = "//input[@id = 'address1']")
	WebElement address;
	@FindBy(how = How.XPATH, using = "//input[@id = 'city']")
	WebElement city;
	@FindBy(how = How.XPATH, using = "//select[@id = 'id_state']")
	WebElement state;
	@FindBy(how = How.XPATH, using = "//input[@id = 'postcode']")
	WebElement zipcode;
	@FindBy(how = How.XPATH, using = "//select[@id = 'id_country']")
	WebElement country;
	@FindBy(how = How.XPATH, using = "//input[@id = 'phone_mobile']")
	WebElement phoneMobile;
	@FindBy(how = How.XPATH, using = "//button[@id = 'submitAccount']")
	WebElement registerButton;

	/**
	 * Method to click title
	 */
	public void clickTitle() {
		titleRadio.click();
	}

	/**
	 * Method to fill firstName
	 */
	public void firstName() {
		firstName.sendKeys(GenericConstant.FIRST_NAME);
	}

	/**
	 * Method to fill LastName
	 */
	public void lastName() {
		lastName.sendKeys(GenericConstant.LAST_NAME);
	}

	/**
	 * Method to fill password
	 */
	public void password() {
		password.sendKeys(GenericConstant.PASSWORD);
	}

	/**
	 * Method to fill address
	 */
	public void address() {
		address.sendKeys(GenericConstant.ADDRESS);
	}

	/**
	 * Method to fill city
	 */
	public void city() {
		city.sendKeys(GenericConstant.CITY);
	}

	/**
	 * Method to fill state
	 */
	public void state() {
		Select type = new Select(state);
		type.selectByVisibleText("Alabama");

	}

	/**
	 * Method to fill zip
	 */

	public void zip() {
		zipcode.sendKeys(GenericConstant.Zinpcode);
	}

	/**
	 * Method to fill country
	 */

	public void country() {
		Select type = new Select(country);
		type.selectByVisibleText("United States");

	}

	/**
	 * Method to fill mobileNo
	 */

	public void mobileNo() {
		phoneMobile.sendKeys(GenericConstant.MOBILE_NO);
	}

	/**
	 * Method to click register
	 */
	public void register() {
		registerButton.click();
	}
}
