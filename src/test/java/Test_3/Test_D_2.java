package Test_3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_D_2 {
	
	@Test
	public void verify_test_1() {
		
		System.out.println("Email Enter");
		System.out.println("Password enter");
		System.out.println("Login button click");
		
		String expected="BugSpotter";
		String actual="BugSpotter";
		Assert.assertEquals(actual, expected);   // fail execution abort
		
		System.out.println("Test Done");
}
	@Test
	public void Test_2() {
		
		System.out.println();
	}
	
}
