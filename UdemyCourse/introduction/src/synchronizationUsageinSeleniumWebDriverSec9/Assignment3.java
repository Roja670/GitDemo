package synchronizationUsageinSeleniumWebDriverSec9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		WebDriverWait wait=new WebDriverWait(driver,5);
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("password")).sendKeys("learning");
		driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement options1=driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown=new Select(options1);
		dropdown.selectByValue("consult");
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		driver.findElement(By.id("signInBtn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));
		for(int i =0;i<3;i++)
		{
		products.get(i).click();
		}
		
		driver.findElement(By.partialLinkText("Checkout")).click();
		}
}







