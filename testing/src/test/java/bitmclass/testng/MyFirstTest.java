package bitmclass.testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class MyFirstTest {
	@Test
	
	public void test1() {
		System.out.println("Test 1");
	
	}
	
	
	@Test
	public void name() {
		System.out.println("Hello THis is Name");
	}
	
	@Test(groups = {"vip"}, priority=3)
	private void car1() {
		// TODO Auto-generated method stub
		System.out.println("Car 1 is running");

	}
	
	@Test(groups = {"general"},priority=3 , dependsOnGroups= {"vip"})
	private void car2() {
		// TODO Auto-generated method stub
		System.out.println("Car 2 is running");

	}
	
	@Test(groups = {"general"},priority=2)
	private void car3() {
		// TODO Auto-generated method stub
		System.out.println("Car 3 is running");

	}
	
	@BeforeClass
	
	private void bclass() {
		// TODO Auto-generated method stub
		System.out.println("This is before class ");

	}
	
	@AfterClass
	
	private void after() {
		// TODO Auto-generated method stub
		
		System.out.println("This sis after class ");

	}

}
