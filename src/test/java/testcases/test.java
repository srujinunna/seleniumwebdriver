package testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.welback.utility.Utils;

public class test {
	
	private WebDriver driver;
	@BeforeTest
	public void start() {
		driver = new HtmlUnitDriver();
		driver.get("http://google.com");
	}
	@Test
	public void testgoogle() {
		String abc = driver.getTitle().toString();
		System.out.println(abc);
	}
	@AfterTest
	public void down() {
		driver.close();
	}
	
}
