package com.ntt.finalcasestudy;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AmazonExample extends Base {

	public static void main(String[] args) throws InterruptedException {

		/* for setting driver to chrome driver */
		getDriver();

		/* for maximizing chrome browser */
		driver.manage().window().maximize();

		/* passing url into chrome browser */
		getUrl("https://www.amazon.in/");

		Thread.sleep(3000);

		/* passing search bar id to web element */
		WebElement search_bar = driver.findElement(By.id("twotabsearchtextbox"));

		/* passing value into the search bar */
		type(search_bar, "I-phone XR");

		/* pausing execution of 3 seconds */
		Thread.sleep(3000);

		/* passing search click button id to web element */
		WebElement search_button = driver.findElement(By.id("nav-search-submit-button"));

		/* clicking on search button */
		btnClick(search_button);

		/* pausing execution of 3 seconds */
		Thread.sleep(3000);

		/*
		 * WebElement mobile_click = driver.findElement( By.
		 * xpath("(//span[text()='Apple iPhone XR 64GB Coral (includes EarPods, power adapter)'])[1]"
		 * )); btnClick(mobile_click);
		 */

		/* passing the class xpath of the first product which has appeared */
		WebElement mobile_click = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));

		/* clicking on the first product appeared */
		btnClick(mobile_click);

		/* getting the current window id in string format */
		String pwid = driver.getWindowHandle();

		/* System.out.println(pwid); */

		/*
		 * getting all opened chrome window values in string format without duplicates
		 * using set interface
		 */
		Set<String> all = driver.getWindowHandles();

		/* pausing execution of 3 seconds */
		Thread.sleep(3000);

		/* switching to the next window using for-each */
		for (String a : all) {
			if (!pwid.equals(a)) {
				driver.switchTo().window(a);
			}
		}

		/* getting element id of add to cart button */
		WebElement addToCart_btn = driver.findElement(By.id("add-to-cart-button"));

		/* clicking on add to cart button */
		btnClick(addToCart_btn);

		/* pausing execution of 3 seconds */
		Thread.sleep(3000);

		/* getting the id of added to text */
		WebElement text = driver.findElement(By.xpath("//*[@id=\"attachDisplayAddBaseAlert\"]/div/h4"));

		/* by using getText() method getting value of the id */
		String text2 = text.getText();

		/* printing the value of getText indide the console */
		System.out.println(text2);

		/* pausing execution of 3 seconds */
		Thread.sleep(3000);

		/* getting the id of the close button using id */
		WebElement close_btn = driver.findElement(By.id("attach-close_sideSheet-link"));

		/* clicking on the button */
		btnClick(close_btn);

		/* pausing execution of 2 seconds */
		Thread.sleep(2000);

		/* closing all the opened tabs */
		driver.quit();

	}
}
