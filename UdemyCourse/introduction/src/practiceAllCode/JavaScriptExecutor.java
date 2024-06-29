package practiceAllCode;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			
			WebDriver driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			//if you want to scroll till table
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,550)");
			//if you want to scroll table inside scroll
			//if horizontal scroll left
			Thread.sleep(5000);
			js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
			//to get all the values of 4th column
			//to print sum
			int sum=0;
			List<WebElement>values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
			for(int i=0;i<values.size();i++)
			{
				sum=sum+Integer.parseInt(values.get(i).getText());
			}
			System.out.println(sum);
			driver.findElement(By.cssSelector(".totalAmount")).getText();
			int total=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
			Assert.assertEquals(sum, total);
			

	}

}
