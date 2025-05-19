package testNG;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups={"sanity"})
	void test_loginByFacebook() {
		System.out.println("login by facebook");
	}
	@Test(groups={"sanity"})
	void test_loginByEmail() {
		System.out.println("login by email");
	}
	@Test(groups={"sanity"})
	void test_loginByTwitter() {
		System.out.println("login by twitter");
	}

}
