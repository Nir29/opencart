package javaforinterview;

public class FinftheSecondmaxNumber {
	public static void main(String[]args) {
	
		int[] arr = {5, 1, 2, 8, 9, 3};
		int max = Integer.MAX_VALUE, secondMax = Integer.MAX_VALUE;

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