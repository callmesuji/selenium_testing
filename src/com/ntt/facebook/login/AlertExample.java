package com.ntt.facebook.login;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\sujith\\LaunchBrowser\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");

		WebElement signin = driver.findElement(By.xpath("//input[@value='SIGN IN']"));
		signin.click();

		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);

		System.out.println(al.getText());

//		accept
		al.accept();

//      confirm
		al.dismiss();

//		prompt
		al.sendKeys("ok button");
		al.accept();

//		cancel
		al.sendKeys("cancel");
		al.dismiss();

	}

}
