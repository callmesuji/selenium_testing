package com.ntt.facebook.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookBrowserLaunch {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\sujith\\LaunchBrowser\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		String title = driver.getTitle();

		System.out.println(title);

		String cu = driver.getCurrentUrl();

		WebElement txtMail = driver.findElement(By.xpath("//input[@type='text']"));

		txtMail.sendKeys("selenium");
		String att = txtMail.getAttribute("value");
		System.out.println("value we entered inside the text ------- " + att);

		WebElement txtPwd = driver.findElement(By.xpath("//input[@type='password']"));
		String attribute = txtPwd.getAttribute("class");
		System.out.println("class name of pwd -------- " + attribute);

		txtPwd.sendKeys("root");

		WebElement txt = driver.findElement(By.xpath("//div[text()=' for a celebrity, brand or business.']"));
		String text = txt.getText();
		System.out.println("Text is " + text);
		String attribute2 = txt.getAttribute("class");

		System.out.println(attribute2);

		WebElement para = driver.findElement(By.xpath("//*[contains(text(),'Facebook helps you')]"));

		String text2 = para.getText();
		System.out.println(text2);

		WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		loginBtn.click();

		System.out.println(cu);

//		driver.quit();
	}

}
