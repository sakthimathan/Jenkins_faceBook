package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class Login_Page_Pom extends Base{

	

	// Locators for the login page elements
	private By emailField = By.id("email");
	private By passwordField = By.id("pass");
	private By loginButton = By.name("login");

	// Constructor
	public Login_Page_Pom() {
		PageFactory.initElements(driver, this);
	}

	// Method to enter email
	public void enterEmail(String email) {
		WebElement emailInput = driver.findElement(emailField);
		emailInput.sendKeys(email);
	}

	// Method to enter password
	public void enterPassword(String password) {
		WebElement passwordInput = driver.findElement(passwordField);
		passwordInput.sendKeys(password);
	}

	// Method to click login button
	public void clickLoginButton() {
		WebElement loginBtn = driver.findElement(loginButton);
		loginBtn.click();
	}


	// Method to perform login action
	public void login(String email, String password) {
		enterEmail(email);
		enterPassword(password);
		clickLoginButton();
	}
	

}
