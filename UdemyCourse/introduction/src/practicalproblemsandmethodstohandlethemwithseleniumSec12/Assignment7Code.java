package practicalproblemsandmethodstohandlethemwithseleniumSec12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment7Code {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			
			WebDriver driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			WebElement table=driver.findElement(By.id("product"));
			System.out.println(table.findElements(By.tagName("tr")).size());
			System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
			List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
			System.out.println(secondrow.get(0).getText());
			System.out.println(secondrow.get(1).getText());
			System.out.println(secondrow.get(2).getText());
	}
}

