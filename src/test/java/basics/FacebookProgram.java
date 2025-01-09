package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookProgram {
WebDriver driver;
	
	@BeforeMethod
	public void launchbrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	@Test(dataProvider = "Facebook Login Creds",dataProviderClass = DataProviders.class)
	public void productsearch(String username,String pass) 
	{
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys(username);
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys(pass);
		
	}


}
