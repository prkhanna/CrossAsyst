package com.auto.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Prince Khanna
 *
 */
public class ProductCheckoutPopup {
	/**
	 * Web Elements for this Page
	 */
	@FindBy(how= How.XPATH, using ="//a[@title= 'Proceed to checkout']") WebElement checkout;
	
	
	/**
	 *  Method to click Button
	 */
	public void checkoutButton() {
		checkout.click();
	}

}
