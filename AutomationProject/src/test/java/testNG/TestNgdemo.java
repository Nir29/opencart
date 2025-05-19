package testNG;

import org.testng.annotations.Test;

public class TestNgdemo {
	@Test(priority=1)
	void testlogin() {
		System.out.println("this is login");
	}
	@Test(priority=2)
	void testsearch() {
		System.out.println("this is search");
	}
	@Test(priority=3)
	void testlogOut() {
		System.out.println("this is logout");
	}

}
