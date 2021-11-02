package com.ntt.facebook.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\sujith\\LaunchBrowser\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/guru99home/");

//			web element
//		WebElement frame = driver.findElement(By.id("a077aa5e"));

//		frame.click();

//		switch with id
//		driver.switchTo().frame("a077aa5e");

//		switch with name
//		driver.switchTo().frame("a077aa5e");

//		switch with frame index
//		driver.switchTo().frame(4);

//		switch with web element
		WebElement fr = driver.findElement(By.xpath("//*[@id=\"a077aa5e\"]"));

		List<WebElement> list = driver.findElements(By.tagName("iframe"));

		int size = list.size();

		System.out.println(list.size());

		driver.switchTo().frame(fr);

		WebElement img = driver.findElement(By.xpath("/html/body/a/img"));
		img.click();

		if (size >= 1) {
			driver.switchTo().frame(0);
			driver.findElement(By.id("email")).sendKeys("email");
		}

		if (size >= 1) {
			driver.switchTo().frame(1);
			driver.findElement(By.id("pwd")).sendKeys("pwd");
		}

		if (size >= 1) {
			driver.switchTo().frame(2);
			driver.findElement(By.id("loginbutton")).click();
		}
//		 from 1st frame to 8th frame switching directly possible
		driver.switchTo().frame(7);

//		but switching from 8th to first not possible
		driver.switchTo().parentFrame(); // 7
		driver.switchTo().parentFrame(); // 6
		driver.switchTo().parentFrame(); // 5
		driver.switchTo().parentFrame(); // 4
		driver.switchTo().parentFrame(); // 3
		driver.switchTo().parentFrame(); // 2
		driver.switchTo().parentFrame(); // 1

//		2frames  switching from 2nd to 1st

		driver.switchTo().defaultContent();

		for (int i = 1; i <= size; i++) {
			driver.switchTo().parentFrame();
		}	

	}

}
