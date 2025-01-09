package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertExample {
	WebDriver driver;
	SoftAssert softassert=new SoftAssert();
	
	@BeforeMethod
	public void launchbrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
	}
	
	@Test
	public void verifyShowSelectedButton() {
		
		WebElement button1=driver.findElement(By.xpath("//button[contains(text(),'Show Selected Value')]"));
		
		String actualButtonName=button1.getText();
		String btnclr=button1.getCssValue("background-color");
		boolean btnisenabled=button1.isEnabled();
		System.out.println(actualButtonName);
		System.out.println(btnclr);
		System.out.println(btnisenabled);
		String expButtonName="Show Selected Value";
		String expclr="rgba(0, 123, 255, 1)";
		boolean expbtnstatus=true;
		softassert.assertEquals(actualButtonName, expButtonName);
		softassert.assertEquals(btnclr, expclr);
		softassert.assertEquals(btnisenabled, expbtnstatus);
		softassert.assertAll();
	
	}

}
