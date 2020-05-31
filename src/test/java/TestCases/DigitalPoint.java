package TestCases;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import BaseClass.BrowserSetUp;

public class DigitalPoint extends BrowserSetUp {
	
	@Test
	public void digitalPointPractice() throws InterruptedException, IOException {
		
		driver.get("https://digitalpoint.tech/sqa/");
		
		Actions act=new Actions(driver);
		String clickTab=Keys.chord(Keys.CONTROL, Keys.ENTER);
		
	    WebElement ele=driver.findElement(By.xpath("//*[@id=\"nav-services\"]"));
	    
	    act.moveToElement(ele).build().perform();
	    
	    WebElement header=driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/div/ul"));
	    
	    header.findElement(By.linkText("Automation Testing")).sendKeys(clickTab);
	    header.findElement(By.linkText("Manual Testing")).sendKeys(clickTab);
	    header.findElement(By.linkText("API Testing")).sendKeys(clickTab);
	    header.findElement(By.linkText("Security Testing")).sendKeys(clickTab);
	    header.findElement(By.linkText("Performance Testing")).sendKeys(clickTab);
	    Thread.sleep(5000L);
	    
	    Set<String>w=driver.getWindowHandles();
	    Iterator<String>it=w.iterator();
	    
	    
	    String window0=it.next();
	    String window1=it.next();
	    String window2=it.next();
	    
	    driver.switchTo().window(window2);
	    
	    TakesScreenshot tsc=(TakesScreenshot)driver;
	    File srcFile=tsc.getScreenshotAs(OutputType.FILE);
	    
	    File f=new File("C:\\Digital Point\\Screenshot\\Digitalpoint.png");
	    
	    FileUtils.copyFile(srcFile, f);
	    
	    System.out.println(driver.switchTo().window(window1).getTitle());
	    
	    driver.close();
	}
}
