package stringInerviewQ;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of term=");
		int term=sc.nextInt();
		int first=0;
		int second=1;
		int next;
		System.out.println("fibonacci series is");
		for(int i=0;i<=term;i++) {
			System.out.println(first +"");
			next=first+second;
			first=second;
			second=next;
		}

	}

}
