package practiceAllCode;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScopeCountLinks {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//1.Give me the no of links count on the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		//2.Give me the no of links count on the footer section
				//limiting web driver scope
		WebElement footerSection=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerSection.findElements(By.tagName("a")).size());
		
		//3.Links count of only 1st column in the footer section
		WebElement columnSection=footerSection.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnSection.findElements(By.tagName("a")).size());
		//4.Click on each link in the column check if the pages are opening
		
		for(int i=1;i<columnSection.findElements(By.tagName("a")).size();i++)
		{
			//if you want to open another tab 1st you have to click control
			String clickOnLinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);//This combination will let you know to open in another tab
			columnSection.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(5000);
		}
		Set<String> text=driver.getWindowHandles();
		Iterator<String> it=text.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		

	}

}
