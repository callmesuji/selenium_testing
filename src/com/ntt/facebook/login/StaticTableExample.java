package com.ntt.facebook.login;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTableExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\sujith\\LaunchBrowser\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/web-table-element.php");

		System.out.println("-------------------ROWS WITH DATA--------------------");

//		printing along with row

		List<WebElement> trows = driver.findElements(By.tagName("tr"));

		for (int i = 0; i < trows.size(); i++) {
			WebElement row = trows.get(i);
			String text2 = row.getText();

//			form row we are printing data inside the row
			List<WebElement> tdatas = row.findElements(By.tagName("td"));

			for (int j = 0; j < tdatas.size(); j++) {
				WebElement tdata1 = tdatas.get(j);
				String text = tdata1.getText();
				System.out.println(text);

			}
		}
		System.out.println("-------------------ONLY DATA--------------------");
//		iterating directly with td
		List<WebElement> tdatas1 = driver.findElements(By.tagName("td"));

		for (int i = 0; i < tdatas1.size(); i++) {
			WebElement row = tdatas1.get(i);
			String text = row.getText();
			System.out.println(text);
		}

		System.out.println("-------------------ONLY ROWS--------------------");

//		iterating directly with tr
		List<WebElement> trows1 = driver.findElements(By.tagName("tr"));

		for (int i = 0; i < trows1.size(); i++) {
			WebElement row = trows1.get(i);
			String text = row.getText();
			System.out.println(text);
		}

		System.out.println("-------------------HEADINGS--------------------");

//		printing only with headings
		List<WebElement> theads = driver.findElements(By.tagName("th"));

		for (int i = 0; i < theads.size(); i++) {

			WebElement thead = theads.get(i);
			String text = thead.getText();
			System.out.println(text);

		}

		System.out.println("-------------------ONLY PARTICULAR ROW AND COLUMN DATA-----------------");

		for (int i = 0; i < trows.size(); i++) {
			WebElement rows = trows.get(i);

			List<WebElement> td = rows.findElements(By.tagName("td"));

			for (int j = 0; j < td.size(); j++) {
				WebElement datas = td.get(j);
				String text2 = datas.getText();

				if (text2.equals("REC")) {
					System.out.println("Row number " + i);
					System.out.println("Column number " + j);
				}
			}
		}

		System.out.println("-------------USING FOR EACH----------------");

		for (WebElement t : trows) {
			List<WebElement> datas = t.findElements(By.tagName("td"));
			for (WebElement d : datas) {
				System.out.println(d.getText());

			}

		}

	}

}
