package com.welback.appmodules;

import org.openqa.selenium.WebDriver;

import com.welback.pageobjects.DetailPage;
import com.welback.pageobjects.HomePage;

public class CommentAction {

	private WebDriver driver;
	HomePage home;
	DetailPage detail;
	
	public CommentAction(WebDriver driver) {
		this.driver = driver;
		home = new HomePage(driver);
		detail = new DetailPage(driver);
	}
	
	public void guestComment(String comment, String name, String email) {
		//clicking on the reviews tab
		detail.getReviews_tab().click();
		//clicking on the 5 start rating
		detail.getRating().click();
		//sending comment string to the comment textbox
		detail.getComment().sendKeys(comment);
		//sending author name to the author box
		detail.getAuthor().sendKeys(name);
		//sending author email to the email box
		detail.getEmail().sendKeys(email);
		//clicking on the submit button
		detail.getSubmit().click();
	}
	public Boolean isGuestCommented(String status) {
		detail.getReviews_tab().click();
		return detail.getComments().getText().contains(status);
	}
}
