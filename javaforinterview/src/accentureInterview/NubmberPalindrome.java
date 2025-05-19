package accentureInterview;

import java.util.Scanner;

public class NubmberPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num=");
		int num=sc.nextInt();
		int actNum=num;
		int rev=0;
		while(num!=0){
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		if(rev==actNum) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
sc.close();
	}

}
