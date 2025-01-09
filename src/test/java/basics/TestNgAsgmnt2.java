package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgAsgmnt2 {
WebDriver driver;
	
	@BeforeMethod
	public void launchbrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/dynamic-load.php");
	}
	@Test
	public void   verifyTextOfButton() {
		WebElement buttonname=driver.findElement(By.xpath("//button[contains(text(),'Get New User')]"));
		String actualButtonName=buttonname.getText();
		System.out.println(actualButtonName);
		String expButtonName="Get New User";
		Assert.assertEquals(actualButtonName,expButtonName);	
	}
	
	@Test
	public void   verifyImage() {
		WebElement button=driver.findElement(By.xpath("//button[contains(text(),'Get New User')]"));
		WebElement image=driver.findElement(By.xpath("//div[@class='card text-center']/img"));
		button.click();
		boolean actualresult=image.isDisplayed();
		System.out.println(actualresult);
		boolean Expectedresult=true;
		Assert.assertEquals(actualresult,Expectedresult);	
	}
	
}
