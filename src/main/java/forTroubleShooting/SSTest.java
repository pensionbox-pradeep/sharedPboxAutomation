package forTroubleShooting;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.WipBaseClass;

public class SSTest extends WipBaseClass{
	
	@Test
	public void ssTest() {
		System.out.println("Inside ssTest");
		driver.get("https://www.google.com/");
		Assert.assertTrue(false, "Failed intentionally");
	}
	
}
