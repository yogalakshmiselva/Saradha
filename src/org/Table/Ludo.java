package org.Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ludo {

	private static WebElement findElement;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selvamani\\eclipse-workspace\\WebTable\\Driver\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
	  /*driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		//No of data available in table
		List<WebElement> row = driver.findElements(By.tagName("td"));//findelementss
		int size = row.size();
		System.out.println(size);
		for(int i=0;i<size;i++)
		{
		WebElement webElement = row.get(i);
		String text = webElement.getText();
		System.out.println(text);*/
		
		//no of data available in rows
	/*	driver.get("https://demo.guru99.com/test/write-xpath-table.html");
		List<WebElement> first = driver.findElements(By.tagName("tr"));
		int size = first.size();
	    WebElement webElement = first.get(1);
	    String text = webElement.getText();
	    System.out.println(text);*/
		
		//to get all even no. of rows
		driver.get("https://demo.guru99.com/test/write-xpath-table.html");
		List<WebElement> even = driver.findElements(By.tagName("tr"));
		int size = even.size();
		for(int i=0;i<size;i++)
		{
			if(i%2==0) {
				WebElement webElement = even.get(i);
				String text = webElement.getText();
				System.out.println(text);
			}
		}
		}

	}


