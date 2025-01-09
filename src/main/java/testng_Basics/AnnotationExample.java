package testng_Basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationExample {

	@BeforeSuite
	public void beforesuite() {

		System.out.println("Executing before suite");

	}
	@AfterSuite
	public void aftersuite() {
		
		System.out.println("Executing aftersuite test");
	}

	@BeforeTest
	public void beforetest() {
		
		System.out.println("Executing before test");
	}
	@AfterTest
	public void aftertest() {
		
		System.out.println("Executing after test");
	}
	
	@BeforeClass
	public void beforeclass() {
		
		System.out.println("Executing before class");
	}
	@AfterClass
	public void afterclass() {
		
		System.out.println("Executing after class");
	}
	
	@Test
	public void testcase1() {
		
		System.out.println("Executing testcase 01");
	}
	
	@BeforeMethod
	public void beforemethod() {
		
		System.out.println("Executing before method");
	}
	
	@AfterMethod
	public void aftermethod() {
		
		System.out.println("Executing after method");
	}
	
	@BeforeGroups
	public void beforegroups() {
		
		System.out.println("Executing before groups");
	}
	
	@AfterGroups
	public void aftergroups() {
		
		System.out.println("Executing after groups");
	}
	
	@Test
	public void testcase2() {
		
		System.out.println("Executing testcase 2");
	}

}
