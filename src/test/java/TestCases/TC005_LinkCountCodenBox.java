package TestCases;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseClass.BrowserSetUp;

public class TC005_LinkCountCodenBox extends BrowserSetUp {
	
	@Test
	public void linkCount() throws InterruptedException {
		
		driver.get("http://codenboxautomationlab.com/practice/");
		
		WebElement columnDriver=driver.findElement(By.xpath("//*[@id=\"colophon\"]/div[1]/div/div[3]"));
		
		int count=columnDriver.findElements(By.tagName("a")).size();
		
		System.out.println(count);
		
		for (int i=0; i<count; i++) {
			
			String clickOnTab=Keys.chord(Keys.CONTROL, Keys.ENTER);
			
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnTab);
			Thread.sleep(4000L);
		}
		
		Set<String>w=driver.getWindowHandles();
		Iterator<String>it=w.iterator();
		
		while(it.hasNext()) {
			
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
	
		
		
	}

}
