package Test_3;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_D_3 {
	
	@Test
	public void test_3() {
		
		SoftAssert soft=new SoftAssert();
		
		System.out.println("Email Enter");
		System.out.println("Password enter");
		System.out.println("Login button click");
		
		String expected="BugSpotter";
		String actual="bugspotter";
		
		soft.assertEquals(actual, expected);  // fail
		
		System.out.println("Test Done");
		
		soft.assertAll();
	}
	
	
	

}
