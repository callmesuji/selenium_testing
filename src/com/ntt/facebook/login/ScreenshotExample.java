package com.ntt.facebook.login;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotExample {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\sujith\\LaunchBrowser\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");

		TakesScreenshot tk = (TakesScreenshot) driver;
		Thread.sleep(2000);

		File src = tk.getScreenshotAs(OutputType.FILE);

		File des = new File("C:\\Users\\DELL\\eclipse-workspace\\sujith\\LaunchBrowser\\screenshot\\Bank.png");

		FileUtils.copyFile(src, des);

	}

}
