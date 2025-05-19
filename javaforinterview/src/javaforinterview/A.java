package javaforinterview;

public class A {

	public static void main(StringDemo[] args) {
		int[] arr = {5, 1, 2, 8, 9, 3};
		int max = 1000, secondMax = 1000;

		for (int num : arr) {
		    if (num < max) {
		        secondMax = max;
		        max = num;
		    } else if (num < secondMax && num != max) {
		        secondMax = num;
		    }
		}
		System.out.println("Second highest: " + secondMax);


	}

}
