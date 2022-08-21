package Test_Verify;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BaseTest.BaseClass;
import Test_Demo.LoginPom;

public class Test_1 extends BaseClass {
	
	@Test
	public void tc_001() {
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		login.getTxt_emailid().sendKeys("Test");
		login.getTxt_password().sendKeys("12345678");
		login.getbtn_login().click();
		
		
		
	
		
		
	}

}
