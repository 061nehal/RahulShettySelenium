package TestCases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseClass.BrowserSetUp;

public class TC006_LinkCountRShetty extends BrowserSetUp {
	
	@Test
	public void anotherLinkCount() throws InterruptedException {
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement columnDriver=driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
		
		int count=columnDriver.findElements(By.tagName("a")).size();
		
		System.out.println(count);
		
		for (int i=0; i<count; i++) {
			
		String clickOnTab=Keys.chord(Keys.CONTROL, Keys.ENTER);
		columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnTab);
		Thread.sleep(5000L);
		}
		
		Set<String>w=driver.getWindowHandles();
		Iterator<String>it=w.iterator();
		
		while(it.hasNext()) {
			
			String title=driver.switchTo().window(it.next()).getTitle();
			System.out.println(title);
		}
		
	}

}
