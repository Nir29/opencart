package javaforinterview;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(StringDemo[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number=");
		int num=sc.nextInt();
		int original=num;
		int rev=0;
		while(num>0) {
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
			
		}
		if(rev==original) {
			System.out.println("number is palindrome");
		}
		else {
			System.out.println("number is not palindrome");
}
		sc.close();
	}
}
