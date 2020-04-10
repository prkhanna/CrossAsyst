package com.auto.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Prince Khanna
 *
 */
public class AddressPage {

	/**
	 * Web Elements for this Page
	 */
	@FindBy(how = How.XPATH, using = "//button[@name= 'processAddress']")
	WebElement checkout;

	/**
	 * Method to click Button
	 */
	public void chkBtn() {
		checkout.click();
	}
}
