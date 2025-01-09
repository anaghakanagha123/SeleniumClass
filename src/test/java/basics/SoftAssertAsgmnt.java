package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertAsgmnt {
	WebDriver driver;
	SoftAssert softassert=new SoftAssert();
	
	@BeforeMethod
	public void launchbrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/jquery-progress-bar.php");
	}
	
	@Test
	public void verifyButtonEnableButtonText() {
		
		WebElement startDownload=driver.findElement(By.xpath("//button[contains(text(),'Start Download')]"));
		
		String actualButtonName=startDownload.getText();
		String expButtonName="Start Download";
		boolean actualButtonStatus=startDownload.isEnabled();
		boolean expBtnStatus=true;
		
		System.out.println(actualButtonName);
		System.out.println(actualButtonStatus);
		
		softassert.assertEquals(actualButtonName, expButtonName);
		softassert.assertEquals(actualButtonStatus, expBtnStatus);
		softassert.assertAll();
	
	}

}
