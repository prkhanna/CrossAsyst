package com.auto.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Prince Khanna
 *
 */
public class SummaryPage {
	
	

	/**
	 * Web Elements for this Page
	 */
	@FindBy(how= How.XPATH, using ="//span[text()= 'Proceed to checkout']") WebElement checkout;
	
	/**
	 *  Method to click Button
	 */
	public void chkBtn() {
		checkout.click();	
	}
}
