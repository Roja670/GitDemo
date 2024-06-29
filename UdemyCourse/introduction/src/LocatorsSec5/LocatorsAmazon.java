package LocatorsSec5;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorsAmazon {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		WebElement SigninHome=driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		SigninHome.click();
		
		WebElement name=driver.findElement(By.name("email"));
		name.sendKeys("nandarojalin45@gmail.com");
		
		Thread.sleep(2000);
		
		WebElement Continue=driver.findElement(By.id("continue"));
		Continue.click();
		Thread.sleep(2000);
		
		WebElement Password=driver.findElement(By.name("password"));
		Password.sendKeys("Mnbvcxz@1");
		Thread.sleep(2000);
		
		WebElement Signin=driver.findElement(By.id("signInSubmit"));
		Signin.click();
		Thread.sleep(2000);
		
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("nothing 2a mobiles");
		Thread.sleep(2000);
		
		WebElement mobiles=driver.findElement(By.xpath("//div[text()='nothing 2a mobiles']"));
		mobiles.click();
		Thread.sleep(2000);
		
		WebElement nothing=driver.findElement(By.xpath("//span[text()='Nothing Phone (2a) 5G (Black, 8GB RAM, 128GB Storage) | 6.7\" Flexible AMOLED Display | 50MP (OIS) + 50MP | 32MP Front Camera | Custom Mediatek Dimensity 7200 Pro Processor | The Iconic Glyph Interface']"));
		nothing.click();
		Thread.sleep(2000);
		
		
		Set<String> s = driver.getWindowHandles();
		ArrayList ar=new ArrayList(s);
		ar.get(0);
		ar.get(1);
		
		driver.switchTo().window((String)ar.get(1));
		
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        
        Thread.sleep(2000);
        
        WebElement popup=driver.findElement(By.xpath("//a[@id='attach-close_sideSheet-link']"));
        popup.click();
        
       Thread.sleep(3000);
        
       driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
       Thread.sleep(2000);
       
       
       //driver.findElement(By.xpath("//div[@id='nav-cart-text-container'] ")).click();
       
       
       driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
        			
	}

}