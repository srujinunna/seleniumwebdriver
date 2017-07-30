package com.welback.pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private WebDriver driver;

	@FindBy(xpath = ".//*[@id='masthead']/div[1]/div[4]/ul/li[1]/a/span")
	private WebElement login_link;

	@FindBy(xpath = ".//*[@id='masthead']/div[1]/div[4]/ul/li[2]/a/span")
	private WebElement cart_link;

	@FindBy(xpath = ".//*[@id='masthead']/div[1]/div[3]/ul/li/div/div/form/div[1]/div[1]/input[1]")
	private WebElement search_box;

	@FindBy(xpath = ".//*[@id='masthead']/div[1]/div[3]/ul/li/div/div/form/div[1]/div[2]/button")
	private WebElement search_button;

	@FindBy(id = "menu-item-247")
	private WebElement home_link;

	@FindBy(id = "menu-item-232")
	private WebElement shop_link;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogin_link() {
		return login_link;
	}

	public WebElement getSearch_box() {
		return search_box;
	}

	public WebElement getSearch_button() {
		return search_button;
	}

	public WebElement getHome_link() {
		return home_link;
	}

	public WebElement getShop_link() {
		return shop_link;
	}

	public String getTitle() {
		return driver.getTitle();
	}

}
