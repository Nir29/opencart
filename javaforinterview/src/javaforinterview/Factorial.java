package javaforinterview;

import java.util.Scanner;

public class Factorial {

	public static void main(StringDemo[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num=");
		int number=sc.nextInt();
		int factorial=1;
		for(int i=1;i<=number;i++) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
		sc.close();
	}

}
