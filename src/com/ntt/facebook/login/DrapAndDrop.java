package com.ntt.facebook.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrapAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\sujith\\LaunchBrowser\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demo.guru99.com/test/drag_drop.html");
		Actions acc = new Actions(driver);

		WebElement src1 = driver.findElement(By.id("credit2"));
		WebElement des1 = driver.findElement(By.id("bank"));
		acc.dragAndDrop(src1, des1).perform();

		WebElement src2 = driver.findElement(By.id("fourth"));
		WebElement des2 = driver.findElement(By.id("amt7"));
		acc.dragAndDrop(src2, des2).perform();

//		-------------------------------------------------------------------------------

		WebElement src_1 = driver.findElement(By.id("credit1"));
		WebElement des_1 = driver.findElement(By.id("loan"));
		acc.dragAndDrop(src_1, des_1).perform();

		WebElement src_2 = driver.findElement(By.id("fourth"));
		WebElement des_2 = driver.findElement(By.id("amt8"));
		acc.dragAndDrop(src_2, des_2).perform();
	}

}
