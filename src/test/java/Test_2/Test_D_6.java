package Test_2;

import org.testng.annotations.Test;

public class Test_D_6 {
	
	@Test (priority=2,invocationCount=3)
	public void A() {
		System.out.println("A test");
	}
	
	@Test (priority=1,enabled=false)
	public void C() {
		System.out.println("C test");
	}
	
	@Test(priority=3)
	public void B() {
		System.out.println("B test");
	}

}
