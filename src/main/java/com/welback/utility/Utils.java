package com.welback.utility;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {

	private static WebDriver driver = null;
	private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();

/*	public static WebDriver openBrowser(String browserName) {

		//String browserName;
		try {
			//browserName = ExcelHelper.getCellData(testCaseRow, Constant.COL_BROWSER);
			switch (browserName) {
			case "Firefox":
				driver = drivers.get("Firefox");
				if (driver == null) {
					System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER);
					driver = new FirefoxDriver();
					drivers.put("Firefox", driver);
				}

				break;
			case "Chrome":
				driver = drivers.get("Chrome");
				if (driver == null) {
					System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER);
					driver = new ChromeDriver();
					drivers.put("Chrome", driver);
				}
				break;
			case "IE":
				driver = drivers.get("IE");
				if (driver == null) {
					System.setProperty("webdriver.ie.driver", Constant.IE_DRIVER);
					driver = new InternetExplorerDriver();
					drivers.put("IE", driver);
				}
				break;

			case "HTML":
				driver = drivers.get("HTML");
				if(driver == null) {
					driver = new HtmlUnitDriver();
					drivers.put("HTML", driver);
				}
				break;
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return driver;
	}

	public static void closeAllDriver() {
		for (String key : drivers.keySet()) {
			drivers.get(key).close();
		}
	}*/

	public void waitForElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void takeScreenshot(WebDriver driver, String name) {
		try {
			File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File(Constant.PATH_SCREENSHOT + name + ".jpg"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
