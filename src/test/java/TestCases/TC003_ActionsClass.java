package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import BaseClass.BrowserSetUp;

public class TC003_ActionsClass extends BrowserSetUp {
	
	@Test
	public void amazonPractice() throws InterruptedException {
		
		driver.get("https://www.amazon.ca/");
		Actions act=new Actions(driver);
		
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		act.moveToElement(ele).click().keyDown(Keys.SHIFT).sendKeys("khelahobe").build().perform();
		
		Thread.sleep(3000);
		
		WebElement ele1=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[2]"));
		act.moveToElement(ele1).contextClick().build().perform();
		
		
		
	}

}
