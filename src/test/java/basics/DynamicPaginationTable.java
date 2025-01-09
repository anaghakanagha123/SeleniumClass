package basics;

import java.sql.DriverManager;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicPaginationTable {
	WebDriver driver;
	

@BeforeMethod
public void launchBrowser() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://selenium.qabible.in/table-pagination.php");
}
@Test
public void  getTbleHeadings() {
	
	/*WebElement nameRow=driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead//tr[1]//th[1]"));
	WebElement positionRow=driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead//tr[1]//th[2]"));
	System.out.println(nameRow.getText()); 
 	System.out.println(positionRow.getText());*/
	
	List<WebElement> tableHeadings=driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr[1]//th"));
	
	for(WebElement a:tableHeadings) {
		
		System.out.println(a.getText());
	}
}
	@Test
	public void  getAllNames() {
		
		List<WebElement> names=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		System.out.println("All names are: ");
		for(WebElement a:names) {
			System.out.println(a.getText());
		}
		
	}
	
	@Test
	public void  getAllDetails() {
		List<WebElement> cedric=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[4]//td"));
		for(WebElement a:cedric){
			System.out.println(a.getText());
		}
	}
		@Test
		public void  getCedricPosition() {
			List<WebElement> cedricPosition=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[4]//td[3]"));
			for(WebElement a:cedricPosition){
				System.out.println(a.getText());
			}
}	

}
