package accentureInterview;

import java.util.Scanner;

public class LeapYear {

	private static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your year=");
		int year=sc.nextInt();
		if((year%4==0 && year%100!=0)||(year%400==0)) {
			System.out.println("leap year");
		}
		else {
			System.out.println("not leap yaer");
		}

	}

}
