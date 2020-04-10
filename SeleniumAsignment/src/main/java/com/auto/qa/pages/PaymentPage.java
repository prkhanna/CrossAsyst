package com.auto.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Prince Khanna
 *
 */
public class PaymentPage {
	/**
	 * Web Elements for this Page
	 */

	@FindBy(how = How.XPATH, using = "//a[@title= 'Pay by bank wire']")
	WebElement payWireBtn;
	@FindBy(how = How.XPATH, using = "//button[@type= 'submit' and @class ='button btn btn-default button-medium']")
	WebElement submitBtn;
	@FindBy(how = How.XPATH, using = "//strong[text() = 'Your order on My Store is complete.']")
	WebElement confirmationText;

	/**
	 * Method for Pay Wire Payment mode
	 */
	public void paymentviaPayWire() {
		payWireBtn.click();
	}

	/**
	 * Method to get the confirmation Text
	 */
	public void confirmationText() {
		confirmationText.getText();
	}

	/**
	 * Method for Order confirmation button
	 */
	public void OrderCorfirm() {
		submitBtn.click();
	}

}
