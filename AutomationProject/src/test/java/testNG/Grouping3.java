package testNG;

import org.testng.annotations.Test;

public class Grouping3 {
	@Test(groups= {"sanity","regression"})
	void test_paymentInRupees() {
		System.out.println("payment in rupees");
	}
	@Test(groups= {"sanity","regression"})
	void test_paymentInDollars() {
		System.out.println("payments in dollars");
	}

}
