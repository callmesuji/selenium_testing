package com.ntt.facebook.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BaseClassExample extends Base {

	public static void main(String[] args) {

		getDriver();

		getUrl("https://www.facebook.com/");

		WebElement mail = driver.findElement(By.id("email"));
		type(mail, "Java");

		WebElement pwd = driver.findElement(By.id("pass"));
		type(pwd, "API");

		WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
		btnClick(btn);

	}

}
