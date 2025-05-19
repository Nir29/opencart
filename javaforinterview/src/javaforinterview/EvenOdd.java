package javaforinterview;

import java.util.Scanner;

public class EvenOdd {

	public static void main(StringDemo[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number=");
		int num=sc.nextInt();
		while(num!=0 && num>0 ) {
			if(num%2==0) {
				System.out.println("number is even");
				break;
			}
			
			else {
				System.out.println("number is odd");
				break;
			}
		}
		
		sc.close();
	}
	

}
