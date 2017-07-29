package testcases;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.welback.utility.Utils;

public class test {
	
	private WebDriver driver;
	@BeforeTest
	public void start() {
		driver = Utils.openBrowser("HTML");
		driver.get("http://google.com");
	}
	@Test
	public void testgoogle() {
		String abc = driver.getTitle().toString();
		System.out.println(abc);
	}
	@AfterTest
	public void down() {
		Utils.closeAllDriver();
	}
	
}
