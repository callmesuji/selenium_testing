package com.ntt.facebook.login;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GmailBrowserLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\sujith\\LaunchBrowser\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		String title = driver.getTitle();
		
		

		System.out.println(title);

		WebElement userName = driver.findElement(By.xpath("//input[@type='email']"));
		userName.sendKeys("sujith@gmail.com");
		
 

		WebElement enterButton = driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']"));
		enterButton.click();

		 
		WebElement nextButton = driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span"));
		nextButton.click();
		
		Actions acc = new Actions(driver);

	}

}
