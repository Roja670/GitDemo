package seleniumWebdriverTechniquestoautomateWebelementsSec7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Dropdownlooping {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			
			WebDriver driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			
			//Check boxes
			Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
			//Assert.assertFalse(true);
			System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
			driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
			System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
			Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
			
			
			//Count number of check boxes
			System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
			
			
			//Select Radio Button
			
			//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
			if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
			{
				System.out.println("its enable");
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
			
			
			
			
			driver.findElement(By.id("divpaxinfo")).click();
			Thread.sleep(1000);
			//driver.findElement(By.id("hrefIncAdt")).click();
			//driver.findElement(By.id("btnclosepaxoption")).click();
			
			
			  //int i=1; 
			  //while(i<5) 
			 // { 
				//  driver.findElement(By.id("hrefIncAdt")).click(); 
				//  i++; 
			 // }
			  //driver.findElement(By.id("btnclosepaxoption")).click();
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			for(int i=1;i<5;i++)
			{
				driver.findElement(By.id("hrefIncAdt")).click(); 
			}
			driver.findElement(By.id("btnclosepaxoption")).click();
			Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
			
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			
			
			 
			

	}

}
