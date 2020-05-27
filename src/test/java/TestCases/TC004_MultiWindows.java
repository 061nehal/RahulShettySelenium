package TestCases;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import BaseClass.BrowserSetUp;

public class TC004_MultiWindows extends BrowserSetUp {
	
	@Test
	public void multiWindows() throws InterruptedException, IOException {
		
		driver.get("https://the-internet.herokuapp.com/");
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.linkText("Multiple Windows"));
		act.moveToElement(ele).click().build().perform();
		
		WebElement ele1=driver.findElement(By.linkText("Click Here"));
		act.moveToElement(ele1).click().build().perform();
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String>itr=windows.iterator();
		
		String parenteWindow=itr.next();
		String childWindow=itr.next();
	
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		TakesScreenshot tShot=(TakesScreenshot)driver;
		File srcFile=tShot.getScreenshotAs(OutputType.FILE);
		File destFile=new File("C:\\Digital Point\\Screenshot\\Practice.png");
		
		FileUtils.copyFile(srcFile, destFile);
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		
		
		
	}

}
