package com.welback.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailPage {

	private WebDriver driver;

	@FindBy(xpath = ".//*[@id='product-8']/div/div[1]/div/div[2]/form/button")
	private WebElement add_to_cart;

	@FindBy(xpath = ".//*[@id='product-8']/div/div[2]/div/div/ul/li[2]/a")
	private WebElement reviews_tab;

	@FindBy(xpath = ".//*[@id='commentform']/p[1]/p/span/a[5]")
	private WebElement rating;

	@FindBy(id = "comment")
	private WebElement comment;

	@FindBy(id = "author")
	private WebElement author;

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "submit")
	private WebElement submit;

	@FindBy(id = "comments")
	private WebElement comments;

	public DetailPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getAdd_to_cart() {
		return add_to_cart;
	}

	public WebElement getReviews_tab() {
		return reviews_tab;
	}

	public WebElement getRating() {
		return rating;
	}

	public WebElement getComment() {
		return comment;
	}

	public WebElement getAuthor() {
		return author;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getComments() {
		return comments;
	}

	public String getTitle() {
		return driver.getTitle();
	}

}
