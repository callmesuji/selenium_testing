package com.ntt.facebook.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDownExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\sujith\\LaunchBrowser\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");

		WebElement old = driver.findElement(By.id("oldSelectMenu"));

		System.out.println("Attribute value " + old.getText());

		WebElement car = driver.findElement(By.id("cars"));

		Select s = new Select(car);

		List<WebElement> options = s.getOptions();

		System.out.println(options.size());

		for (WebElement o : options) {
			System.out.println(o.getText());
			System.out.println(o.getAttribute("value"));
		}

		s.selectByIndex(1);
		Thread.sleep(1000);

		s.selectByVisibleText("Audi");
		Thread.sleep(1000);

		s.selectByValue("volvo");

		Thread.sleep(3000);
		s.deselectAll();

	}

}
