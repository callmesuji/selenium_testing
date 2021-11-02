package com.ntt.facebook.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassExamples {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\sujith\\LaunchBrowser\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.snapdeal.com/");

		Actions acc = new Actions(driver);

		WebElement mou1 = driver.findElement(By.xpath("//span[text()='Home & Kitchen']"));
		acc.moveToElement(mou1).build().perform();
		System.out.println("text of " + mou1.getText());

		Thread.sleep(2000);

		WebElement mou2 = driver.findElement(By.xpath("//span[text()='Mobile & Tablets']"));
		acc.moveToElement(mou2).perform();
		Thread.sleep(2000);
		WebElement btn = driver.findElement(By.xpath("(//span[text()='Samsung'])[2]"));
		btn.click();

//		

	}

}
