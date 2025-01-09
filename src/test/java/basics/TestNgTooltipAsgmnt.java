package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgTooltipAsgmnt {
WebDriver driver;
	
	@BeforeMethod
	public void launchbrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/window-popup.php");
	}
	
	@Test
	public void  verifToolTip() {
		WebElement likeUsButton=driver.findElement(By.xpath("//a[contains(text(),'Like us On Facebook ')]"));
		String actualToolTipName=likeUsButton.getAttribute("title");
		System.out.println(actualToolTipName);
		String expToolTipName="Follow @obsqurazone on Facebook";
		Assert.assertEquals(actualToolTipName,expToolTipName);	
	}
	
}
