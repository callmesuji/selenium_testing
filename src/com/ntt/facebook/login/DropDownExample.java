package com.ntt.facebook.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\sujith\\LaunchBrowser\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/r.php?locale=en_GB");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@role='button'])[1]")).click();
		WebElement date = driver.findElement(By.id("day"));

		Select s = new Select(date);

		System.out.println(s.isMultiple());
		

//		s.selectByValue("30");

		List<WebElement> options = s.getOptions();
		System.out.println("Size of day " + options.size());

		for (WebElement o : options) {
			System.out.print(o.getText() + " ");
		}
		System.out.println(options.size());

		for (int i = 0; i < options.size(); i++) {
			WebElement elem = options.get(i);
			String text = elem.getAttribute("value");
			System.out.print(text+" ");

		}

	}

}
