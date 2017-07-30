package com.welback.appmodules;

import org.openqa.selenium.WebDriver;

import com.welback.pageobjects.HomePage;
import com.welback.pageobjects.LoginPage;

public class LoginAction {

	private WebDriver driver;
	private HomePage home;
	private LoginPage login;
	
	
	public LoginAction(WebDriver driver) {
		this.driver = driver;
		home = new HomePage(driver);
		login = new LoginPage(driver);
	}
	
	public void execute(String username, String password) {
		//clicking on the login link 
		home.getLogin_link().click();
		//sending username string to the username textbox
		login.getUsername().sendKeys(username);
		//sending password string to the password textbox
		login.getPassword().sendKeys(password);
		//clicking on the remeber me checkbox
		login.getRememberme().click();
		//clicking on the login button
		login.getLogin_button().click();
	}
	public Boolean isUserLogged(String status) {
		return home.getLogin_link().getText().equalsIgnoreCase(status);
	}
}
