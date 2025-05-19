package testNG;

import org.testng.annotations.Test;

public class Grouping2 {
	@Test(groups= {"regression"})
	void test_signupByFacebook() {
		System.out.println("signup by facebook");
	}
	@Test(groups= {"regression"})
	void test_signupByEmail() {
		System.out.println("signup by email");
	}
	@Test(groups= {"regression"})
	void test_signupByTwitter() {
		System.out.println("signup by twitter");
	}

}
