package com.ntt.facebook.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitching {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\sujith\\LaunchBrowser\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone 11");
		Thread.sleep(3000);

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);
		WebElement btn = driver.findElement(By.xpath("//span[text()='Apple iPhone 11 (128GB) - White']"));
		btn.click();
//		parent window id --- 1
		String pwid = driver.getWindowHandle();
		System.out.println(pwid);

//		all windows id(1,2)
		Set<String> all = driver.getWindowHandles();
		System.out.println(all);

//		when there are 10 windows and you want to switch to 7th window
		List<String> emp = new ArrayList<String>();
		emp.addAll(all);
		driver.switchTo().window(emp.get(7));

		for (String a : all) {

			if (!pwid.equals(a)) {
				driver.switchTo().window(a);
			}
		}

		WebElement cart_btn = driver.findElement(By.id("add-to-cart-button"));
		cart_btn.click();

//		switching to 7th window using for each loop
		int count = 0;
		for (String e : all) {
			if (count == 7) {
				driver.switchTo().window(e);
				count++;
			}

		}
	}

}
