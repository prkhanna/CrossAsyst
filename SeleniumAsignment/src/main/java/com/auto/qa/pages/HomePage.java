package com.auto.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Prince Khanna
 *
 */
public class HomePage {

	/**
	 * Web Elements for this Page
	 */
	@FindBy(how = How.XPATH, using = "//a[@title= 'Log in to your customer account']")
	WebElement signIn;
	@FindBy(how = How.XPATH, using = "//a[@title= 'Log me out']")
	WebElement signOut;
	@FindBy(how = How.XPATH, using = "//a[@title= 'Women']")
	WebElement womenSection;
	@FindBy(how = How.XPATH, using = "//img[@alt= 'Blouse']")
	WebElement quickView;

	@FindBy(how = How.XPATH, using = "//a[@title= 'Orders']")
	WebElement orderHistory;
	@FindBy(how = How.XPATH, using = "//a[@title= 'View my customer account']")
	WebElement userLink;

	/**
	 * Method to check the heading
	 */
	public void clickSignIn() {
		signIn.click();
	}

	/**
	 * Method to check the heading
	 */
	public void womenSection() {
		womenSection.click();
	}

	public void clickSignOut() {
		signOut.click();
	}

	/**
	 * Method to check the heading
	 */
	public void itemSelection() {
		quickView.click();
	}

	/**
	 * Method to click on the user account
	 */
	public void clickUserAccount() {
		userLink.click();
	}

	/**
	 * Method to click the order History
	 */
	public void clickOrderHistory() {
		orderHistory.click();
	}
}
