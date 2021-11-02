package com.ntt.finalcasestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample extends Base {

	public static void main(String[] args) throws InterruptedException {

		getDriver();

		getUrl("http://demo.guru99.com/test/drag_drop.html");

		Actions acc = new Actions(driver);

		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement drag1 = driver.findElement(By.id("credit2"));
		WebElement drop1 = driver.findElement(By.id("bank"));

		Thread.sleep(3000);

		acc.dragAndDrop(drag1, drop1).build().perform();

		WebElement drag2 = driver.findElement(By.id("fourth"));
		WebElement drop2 = driver.findElement(By.id("amt7"));

		Thread.sleep(3000);
		acc.dragAndDrop(drag2, drop2).build().perform();


		WebElement drag3 = driver.findElement(By.id("credit1"));
		WebElement drop3 = driver.findElement(By.id("loan"));
		
		Thread.sleep(3000);
		acc.dragAndDrop(drag3, drop3).build().perform();

		WebElement drag4 = driver.findElement(By.id("fourth"));
		WebElement drop4 = driver.findElement(By.id("amt8"));
		
		Thread.sleep(3000);
		acc.dragAndDrop(drag4, drop4).build().perform();


		WebElement success_message = driver.findElement(By.xpath("//a[text()='Perfect!']"));
		Thread.sleep(3000);
		String text = success_message.getText();
		System.out.println(text);

	}

}
