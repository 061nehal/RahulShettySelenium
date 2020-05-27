package TestCases;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC002_ImplicitAndExplicit {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Digital Point\\Automation\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebDriverWait w=new WebDriverWait(driver, 5);


		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		
		additems();
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoBtn")));
		driver.findElement(By.cssSelector(".promoBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		String s=driver.findElement(By.cssSelector(".promoInfo")).getText();
		
		if(s.contains("Code applied ..!")) {
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/button")).click();
		}
		
		




	}

	public static void additems() {
		

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


