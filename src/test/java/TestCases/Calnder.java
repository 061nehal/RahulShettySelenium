package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseClass.BrowserSetUp;

public class Calnder extends BrowserSetUp {
	
	@Test
	public void calenderPractice() throws InterruptedException {
		
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.xpath("//*[@id=\"travel_date\"]")).click();
		
		driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("November");
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("November"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
		}
		Thread.sleep(3000);
		
		List<WebElement>days=driver.findElements(By.className("day"));
		
		for(int i=0; i<days.size(); i++) {
			
			days.get(35).click();	
			break;
			
			
			}
		
		
		
	}

}
