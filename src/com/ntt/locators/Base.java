package com.ntt.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {

	static WebDriver driver;

	public static WebDriver getDriver() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\sujith\\LaunchBrowser\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void type(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void btnClick(WebElement element) {
		element.click();
	}

	public static void close() {
		driver.close();
	}

	public static void selecyByValue(Select select, String value) {
		select.selectByValue(value);

	}

}
