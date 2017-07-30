package com.welback.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "rememberme")
	private WebElement rememberme;

	@FindBy(xpath = ".//*[@id='customer_login']/div[1]/div/form/p[3]/input[3]")
	private WebElement login_button;

	@FindBy(id = "reg_email")
	private WebElement reg_email;

	@FindBy(id = "reg_password")
	private WebElement reg_password;

	@FindBy(xpath = ".//*[@id='customer_login']/div[2]/div/form/p[3]/input[3]")
	private WebElement reg_button;
	
	@FindBy(xpath=".//*[@id='customer_login']/div[1]/div/form/p[4]/a")
	private WebElement lost_password;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getRememberme() {
		return rememberme;
	}

	public WebElement getLogin_button() {
		return login_button;
	}

	public WebElement getReg_email() {
		return reg_email;
	}

	public WebElement getReg_password() {
		return reg_password;
	}

	public WebElement getReg_button() {
		return reg_button;
	}

	public WebElement getLost_password() {
		return lost_password;
	}
	
	
}
