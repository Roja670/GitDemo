package practiceAllCode;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class PerformWebTableSortingOneElementPrice {

	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	    
	    //Click on column
	    driver.findElement(By.xpath("//tr/th[1]")).click();
	    //capture all web elements into list
	    List<WebElement> elementsList=driver.findElements(By.xpath("//tr/td[1]"));
	    //capture text of all web elements into new original List
	   List<String>originalList= elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
	   //sort on the original list of step-3 ->sorted List
	   List<String>sortedList=originalList.stream().sorted().collect(Collectors.toList());
	   //compare original list vs sorted list
	   Assert.assertTrue(originalList.equals(sortedList));
	   
	   
	//scan the name column with get text ->Rice print the price of the rice
	   List<String>price=elementsList.stream().filter(s->s.getText().contains("Beans")).map(s->getPriceVeggie(s))
	   .collect(Collectors.toList());
	   price.forEach(s->System.out.println(s));
	   
	}
	private static String getPriceVeggie(WebElement s)
	{
		String priceValue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;

	}

}
