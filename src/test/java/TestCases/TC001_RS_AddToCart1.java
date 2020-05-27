package TestCases;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseClass.BrowserSetUp;

public class TC001_RS_AddToCart1 extends BrowserSetUp {
	
	@Test
	public void addToCart() {
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		String[] itemsNeeded= {"Cucumber", "Beetroot", "Tomato", "Mushroom"};
		
		
		
		List<WebElement>products=driver.findElements(By.xpath("//div[@class='product']"));
		
		int j=0;
		for (int i=0; i<products.size(); i++) {
			
			String[] name=products.get(i).getText().split("-");
			String formattedName=name[0].trim();
			
			List itemsNeededList=Arrays.asList(itemsNeeded);
			
		
			if (itemsNeededList.contains(formattedName))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==itemsNeeded.length) {
					break;
				}
				
			}
			
		}
	}

}
