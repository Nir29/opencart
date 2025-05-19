package javaforinterview;

import java.util.Scanner;

public class SwapNumber {
	public static void main(StringDemo[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the first number=");
		int a=sc.nextInt();
		System.out.println("enter the second number=");
		int b=sc.nextInt();
		
		System.out.println("before swaping:a="+a+",b="+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swaping;a="+a+",b="+b);
	}

}
