package synchronizationUsageinSeleniumWebDriverSec9;
	import java.time.Duration;
	import java.util.Arrays;
	import java.util.List;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebElement;

	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class ImplicitExplicitWait{

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");

			WebDriver driver = new ChromeDriver(options);
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			WebDriverWait w = new WebDriverWait(driver,5);
			int j = 0;

			String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };

			driver.get("https://rahulshettyacademy.com/seleniumPractise/");

			Thread.sleep(3000);

			addItems(driver, itemsNeeded);
			
			driver.findElement(By.cssSelector("img[alt='Cart']")).click();
			driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
			w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".promoCode")));
			driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
			driver.findElement(By.cssSelector(".promoBtn")).click();
			//Explicit Wait
			
			w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".promoInfo")));
			System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());

		}

		public static void addItems(WebDriver driver, String[] itemsNeeded)

		{

			int j = 0;

			List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

			for (int i = 0; i < products.size(); i++)

			{

	//Brocolli - 1 Kg

	//Brocolli,    1 kg

				String[] name = products.get(i).getText().split("-");

				String formattedName = name[0].trim();

	//format it to get actual vegetable name

	//convert array into array list for easy search

	//  check whether name you extracted is present in arrayList or not-

				List itemsNeededList = Arrays.asList(itemsNeeded);

				if (itemsNeededList.contains(formattedName))

				{

					j++;

	//click on Add to cart

					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

					if (j == itemsNeeded.length)

					{

						break;
					}
				}
			}
		}
	}
	


