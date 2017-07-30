package com.welback.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	public WebElement getSort_dropdown() {
		return sort_dropdown;
	}

	public WebElement getFirst_category() {
		return first_category;
	}

	public WebElement getFirst_product() {
		return first_product;
	}

	public WebElement getAdd_to_cart() {
		return add_to_cart;
	}

	public WebElement getQuick_view() {
		return quick_view;
	}

	public WebElement getNext_page() {
		return next_page;
	}
	
	public String getTitle() {
		return driver.getTitle();
	}

	private WebDriver driver;
	
	@FindBy(xpath=".//*[@id='wrapper']/div/div/div[2]/form/select")
	private WebElement sort_dropdown;
	
	@FindBy(xpath=".//*[@id='woocommerce_product_categories-13']/ul/li[1]/a")
	private WebElement first_category;
	
	@FindBy(xpath=".//*[@id='main']/div/div[2]/div/div[1]/div[1]")
	private WebElement first_product;
	
	@FindBy(xpath=".//*[@id='main']/div/div[2]/div/div[1]/div[1]/div/div[2]/div[1]/div[4]/a[1]/div/strong")
	private WebElement add_to_cart;
	
	@FindBy(xpath=".//*[@id='main']/div/div[2]/div/div[1]/div[1]/div/div[2]/div[1]/div[4]/a[2]")
	private WebElement quick_view;
	
	@FindBy(xpath=".//*[@id='main']/div/div[2]/div/div[2]/nav/ul/li[6]/a")
	private WebElement next_page;
	
	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
