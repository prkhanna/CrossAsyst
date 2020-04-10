package com.auto.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
/**
 * @author Prince Khanna
 *
 */
public class ProductPopup {
	/**
	 * Web Elements for this Page
	 */
	@FindBy(how= How.XPATH, using ="//i[@class= 'icon-plus']") WebElement plusIcon;
	@FindBy(how= How.XPATH, using ="//input[@name='qty']") WebElement quantityText;
	@FindBy(how= How.XPATH, using ="//button[@name= 'Submit']") WebElement addToCart;
	
	
	/**
	 * Method to add the quantity
	 */
	public void qtyAdd() {
		plusIcon.click();
	}

	/**
	 *  Method to click Button
	 */
	public void submitButton() {
		addToCart.click();
	}

	
}
