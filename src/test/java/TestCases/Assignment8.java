package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseClass.BrowserSetUp;

public class Assignment8 extends BrowserSetUp {
	
	@Test
	public void assignment() {
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		WebElement table=driver.findElement(By.id("product"));
		
		int rowCount=table.findElements(By.tagName("tr")).size();
		int colCount=table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size();
		
		System.out.println(colCount);
		
		int count=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td")).size();
		
		for(int i=0; i<count; i++) {
			
			String rowData=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td")).get(i).getText();
			System.out.println(rowData);
		}
		
		
		
		
	}

}
