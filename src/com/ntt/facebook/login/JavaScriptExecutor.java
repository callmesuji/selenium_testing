package com.ntt.facebook.login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\sujith\\LaunchBrowser\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('value','java')", username);
		Object val1 = js.executeScript("return arguments[0].getAttribute('value')", username);

		js.executeScript("arguments[0].setAttribute('value','selenium')", password);
		Object val2 = js.executeScript("return arguments[0].getAttribute('value')", password);

		js.executeScript("arguments[0].click()", login);
		Object val3 = js.executeScript("return arguments[0].getAttribute('value')", login);

		System.out.println(val1.toString());
		System.out.println(val2.toString());
		System.out.println(val3.toString());

	}

}
