package browser_pract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amzn_title
{
	public static void main(String[] args)
	{ 
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.amazon.in/";
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle = "";
		driver.get(baseUrl);
		actualTitle= driver.getTitle();
		if(actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		driver.close();
	}
}
