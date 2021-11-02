package com.ntt.facebook.login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpAndDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\sujith\\LaunchBrowser\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		WebElement up = driver.findElement(By.id("email"));
		WebElement down = driver.findElement(By.xpath("//span[text()=' Facebook © 2021']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true)", down);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(false)", up);

	}

}
