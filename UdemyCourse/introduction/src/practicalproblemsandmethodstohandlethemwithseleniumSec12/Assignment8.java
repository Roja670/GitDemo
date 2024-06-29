package practicalproblemsandmethodstohandlethemwithseleniumSec12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			
			WebDriver driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.findElement(By.id("autocomplete")).sendKeys("ind");
			Thread.sleep(3000);
			
			
			List<WebElement> options1=driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));
			
			for(WebElement option:options1)
			{
				if(option.getText().equalsIgnoreCase("India"))
				{
				    option.click();
				    option.getText();
				    break;
				}
			}
	}
}

