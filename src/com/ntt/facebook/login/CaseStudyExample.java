package com.ntt.facebook.login;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudyExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\sujith\\LaunchBrowser\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();

		Thread.sleep(3000);

		WebElement phone = driver.findElement(By.xpath("//a[text()='Iphone 6 32gb']"));
		phone.click();

		Thread.sleep(3000);

		WebElement cart = driver.findElement(By.xpath("//a[text()='Add to cart']"));
		cart.click();
		Thread.sleep(3000);

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

		Thread.sleep(3000);
		WebElement check_cart = driver.findElement(By.xpath("//a[text()='Cart']"));
		check_cart.click();
		Thread.sleep(3000);

		WebElement place_order_btn = driver.findElement(By.xpath("//button[text()='Place Order']"));
		place_order_btn.click();
		Thread.sleep(3000);

		driver.findElement(By.id("name")).sendKeys("SUJITH");
		Thread.sleep(2000);
		driver.findElement(By.id("country")).sendKeys("INDIA");
		Thread.sleep(2000);
		driver.findElement(By.id("city")).sendKeys("ANANTAPUR");
		Thread.sleep(2000);
		driver.findElement(By.id("card")).sendKeys("2020 5686 9797 0101");
		Thread.sleep(2000);
		driver.findElement(By.id("month")).sendKeys("10");
		Thread.sleep(2000);
		driver.findElement(By.id("year")).sendKeys("2025");
		Thread.sleep(2000);

		WebElement purchase = driver.findElement(By.xpath("//button[@onclick='purchaseOrder()']"));
		purchase.click();
		Thread.sleep(3000);

		WebElement ok_btn = driver.findElement(By.xpath("//button[text()='OK']"));
		ok_btn.click();
		Thread.sleep(3000);
		

		// button[text()='OK']

	}

}
