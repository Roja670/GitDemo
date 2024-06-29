package practiceAllCode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingAlerts {

	public static void main(String[] args) {
		String text="Rahul";
		 System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			
			WebDriver driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.findElement(By.id("name")).sendKeys(text);
			driver.findElement(By.id("alertbtn")).click();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
			
			driver.findElement(By.id("confirmbtn")).click();
			System.out.println(driver.switchTo().alert().getText());
			//driver.switchTo().alert().accept();
			driver.switchTo().alert().dismiss();
			
	}

}
