package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderAsgmnt {
WebDriver driver;
	
	@BeforeMethod
	public void launchbrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/form-submit.php");
	}
	
	@Test(dataProvider = "Form Validations",dataProviderClass = DataProviders.class)
	public void formSubmission(String fName,String lName,String username,String city,String state,String zip) 
	{
		WebElement firstname=driver.findElement(By.xpath("//input[@id='validationCustom01']"));
		WebElement lastname=driver.findElement(By.xpath("//input[@id='validationCustom02']"));
		WebElement user=driver.findElement(By.xpath("//input[@id='validationCustomUsername']"));
		WebElement cityfield=driver.findElement(By.xpath("//input[@id='validationCustom03']"));
		WebElement statefield=driver.findElement(By.xpath("//input[@id='validationCustom04']"));
		WebElement zipcode=driver.findElement(By.xpath("//input[@id='validationCustom05']"));
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(user);
		System.out.println(cityfield);
		System.out.println(statefield);
		System.out.println(zipcode);
		firstname.sendKeys(fName);
		lastname.sendKeys(lName);
		user.sendKeys(username);
		cityfield.sendKeys(city);
		statefield.sendKeys(state);
		zipcode.sendKeys(zip);
	}

	
}
