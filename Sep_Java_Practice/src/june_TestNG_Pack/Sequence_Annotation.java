package june_TestNG_Pack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sequence_Annotation {
	@BeforeTest
	public void beforeTest(){
		System.out.println("2 Before test");
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("4 7 Before Method");
	}
	@BeforeClass
	public void beforeClass(){
		System.out.println("3 Before Class");
	}

	@AfterTest
	public void afterTest(){
		System.out.println("11 After test");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("6 9 After Method");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("10 After Class");
	}
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("1 Before Suite");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("--- 12 --- After Suite");
	}
	
	@Test
	public void test1(){
		System.out.println("5 Test 1");
	}
	
	@Test
	public void test2(){
		System.out.println("8 Test 2");
	}
}
