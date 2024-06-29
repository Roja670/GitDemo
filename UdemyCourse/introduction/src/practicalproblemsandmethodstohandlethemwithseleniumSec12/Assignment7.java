package practicalproblemsandmethodstohandlethemwithseleniumSec12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment7 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			
			WebDriver driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			//if you want to scroll till table
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,550)");
			
			//Tocount table rows/columns
			driver.findElements(By.cssSelector(".table-display tbody"));

			System.out.println(driver.findElements(By.cssSelector(".table-display tbody tr")).size());
			System.out.println(driver.findElements(By.cssSelector(".table-display tbody th")).size());
			
			//Get the data of 2nd row
			List<WebElement>values=driver.findElements(By.cssSelector(".table-display tbody tr:nth-child(4)"));
			for(int i=0;i<values.size();i++)
			{
				System.out.println(values.get(i).getText());
				
			}
			
	}

}
