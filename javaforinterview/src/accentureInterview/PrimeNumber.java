package accentureInterview;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("prime number between 1 to n=");
		int range=sc.nextInt();
		if(primeCheack(range)) {
			System.out.println(range+"is a prime number");
		}
		else {
			System.out.println(range+"is not a prime number");
		}
		sc.close();
	}
	
	
	public static boolean primeCheack(int n) {
		if (n==1)return false;
		if(n==2)return false;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if (n%i==0) {
				return false;
			}
			
		}
		return true;
	}

}
