	package TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import BaseClass.BrowserSetUp;

public class ajairaTest extends BrowserSetUp {
	
	@Test
	public void ekkebareajaira() throws IOException {
		
		driver.get("https://www.cheapoair.ca/");
		
		WebElement from=driver.findElement(By.xpath("//*[@id=\"from0\"]"));
		
		from.sendKeys("d");
		WebDriverWait w=new WebDriverWait(driver, 3);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"panel-1\"]/div/div[3]/div[1]/div/div[1]/div/div[1]/div[1]/section/div/ul")));
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(f, new File("C:\\Digital Point\\Screenshot\\Fcaebook.png"));
		
		for (int i=0; i<=9; i++) {
			 
			
			from.sendKeys(Keys.ARROW_DOWN);
		}
		from.sendKeys(Keys.ENTER);
		}
		
		
	}


