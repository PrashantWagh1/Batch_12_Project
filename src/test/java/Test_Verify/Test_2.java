package Test_Verify;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BaseTest.BaseClass;
import Test_Demo.LoginPom;

public class Test_2 extends BaseClass {
	
	@Test
	public void tc_002() {
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		login.getTxt_emailid().sendKeys("Test");
		login.getTxt_password().sendKeys("1234");
		

}}

