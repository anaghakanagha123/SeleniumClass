package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	WebDriver driver;
	
	@BeforeMethod
	public void launchbrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void verifyAmazonTitle() {
		
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		String expTitle="Happy new year";
		Assert.assertEquals(actualTitle,expTitle);
		
	}
	@Test(dependsOnMethods = "verifyAmazonTitle")//runs only if the dependent test case is passed
	public void verifyUrl() {
		
		String actualUrl=driver.getCurrentUrl();
		System.out.println(actualUrl);
		String expUrl="https://www.amazon.in/";
		Assert.assertEquals(actualUrl,expUrl);
		
	}
	
}
