package seleniumJavaStreamsAutomateSortpaginationFilteringWebTablesSec14;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Filter {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	    
	    driver.findElement(By.id("search-field")).sendKeys("Rice");
	    List<WebElement> veggies=driver.findElements(By.xpath("//tr/td[1]"));
	    //1 Result
	    List<WebElement> filteredList=veggies.stream().filter(veggie->veggie.getText().
	    		contains("Rice")).collect(Collectors.toList());
	    //1 Result
	    Assert.assertEquals(veggies.size(), filteredList.size());
	    

	}

}
