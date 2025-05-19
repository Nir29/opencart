package javaforinterview;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(StringDemo[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number=");
		int no=sc.nextInt();
		int revno=0;
		while(no>0) {
			int digit=no%10;
			revno=revno*10+digit;
			no=no/10;
			
		}
System.out.println(revno);
sc.close();
	}

}
