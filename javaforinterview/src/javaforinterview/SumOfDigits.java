package javaforinterview;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(StringDemo[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int number=num;
		int sum=0;
		while(num>0) {
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
			
		}
		System.out.println("sum of digit is="+sum);
		
sc.close();
	}

}
