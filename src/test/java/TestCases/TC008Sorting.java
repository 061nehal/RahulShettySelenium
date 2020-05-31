 package TestCases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseClass.BrowserSetUp;

public class TC008Sorting extends BrowserSetUp {
	
	@Test
	public void sortingTable() {
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		List<WebElement>firstList=driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		driver.findElement(By.xpath("//tr/th[2]")).click();
		driver.findElement(By.xpath("//tr/th[2]")).click();
		
		ArrayList<String>originalList=new ArrayList<String>();
		
		for (int i=0; i<firstList.size(); i++) {
			
			originalList.add(firstList.get(i).getText());
		}
		
		ArrayList<String>copiedList=new ArrayList<String>();
		
		for(int i=0; i<originalList.size(); i++) {
			
			copiedList.add(originalList.get(i));
		}
		Collections.sort(copiedList);
		for (String s: copiedList) {
			System.out.println(s);
		}
		
		Assert.assertTrue(originalList.equals(copiedList));
		
		
		
		
	}

	
}
