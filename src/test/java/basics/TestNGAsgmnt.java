package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGAsgmnt {
WebDriver driver;
	
	@BeforeMethod
	public void launchbrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/bootstrap-alert.php");
	}
	
	@Test
	public void  VerifyBgColorOfAlert() {
		WebElement alertBgColor=driver.findElement(By.xpath("//div[@class='alert alert-success alert-autoclosable-success']"));
		String actuaAlertBgColor=alertBgColor.getCssValue("background-color");
		System.out.println(actuaAlertBgColor);
		String expAlertBgColor="rgba(212, 237, 218, 1)";
		Assert.assertEquals(alertBgColor,expAlertBgColor);	
	}
	
	@Test
	public void  VerifyFonColorOfAlert() {
		WebElement alertFontColor=driver.findElement(By.xpath("//div[@class='alert alert-success alert-autoclosable-success']"));
		String actuaFontBgColor=alertFontColor.getCssValue("color");
		System.out.println(actuaFontBgColor);
		String expFontColor="rgba(21, 87, 36, 1)";
		Assert.assertEquals(actuaFontBgColor,expFontColor);	
	}
	
}
