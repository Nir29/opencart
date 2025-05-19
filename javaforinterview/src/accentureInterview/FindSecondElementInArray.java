package accentureInterview;

import java.util.Arrays;

public class FindSecondElementInArray {

	public static void main(String[] args) {
		int a[]= {10,70,30,80,20,60};
		int largest=Integer.MIN_VALUE;
		int secondlargest=Integer.MIN_VALUE;
		for(int num:a) {
			if(num>largest) {
				secondlargest=largest;
				largest=num;
			}
			else if(num>secondlargest && num!=largest){
				secondlargest=num;
			}
		}
		System.out.println("secondlargest number is="+secondlargest);
	}

}
