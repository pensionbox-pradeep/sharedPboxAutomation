package forTroubleShootingTest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseClass;


@Listeners(generic.ITestListenerClass.class)

public class Testtest extends BaseClass{
		
	@Test
	public void test1dewesh() {
		System.out.println("Test "+ ut.getMethodName()+"  start");
		System.out.println("Test 1 end");
		Assert.assertEquals(true,true, "TP");
	}
	
	@Test
	public void test2() {
		System.out.println("Test "+ ut.getMethodName()+"  start");
		System.out.println("Test 2 end");
		Assert.assertEquals(false,true, "TF");
	}
	
	@Test
	public void test3() {
		System.out.println("Test "+ ut.getMethodName()+"  start");
		System.out.println("Test 3 end");
		Assert.assertEquals(false,false, "TF");
	}
	
	@Test(dependsOnMethods = "test3")
	public void test4() {
		System.out.println("Test "+ ut.getMethodName()+"  start");
		System.out.println("Test 4 end");
		Assert.assertEquals(true,true, "TE?");
	}
}
