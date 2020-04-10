package com.auto.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Prince Khanna
 *
 */
public class ShippingPage {
	/**
	 * Web Elements for this Page
	 */
	@FindBy(how= How.XPATH, using ="//input[@name= 'cgv']") WebElement acceptCheckbox;
	@FindBy(how= How.XPATH, using ="//button[@name= 'processCarrier']") WebElement submitBtn;
	
	
	/**
	 *  Method to click Button
	 */
	public void chkBtn() {
		submitBtn.click();	
	}
	
	/**
	 *  Method to check the checkbox for Terms and condition
	 */
	public void checkTermOfService() {
		acceptCheckbox.click();	
	}

}
