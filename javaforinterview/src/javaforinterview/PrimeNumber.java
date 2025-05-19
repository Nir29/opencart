package javaforinterview;

import java.util.Scanner;

public class PrimeNumber {
	

	
	    public static void main(StringDemo[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get number from user
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();

	        // Check if the number is prime
	        if (isPrime(num)) {
	            System.out.println(num + " is a prime number.");
	        } else {
	            System.out.println(num + " is not a prime number.");
	        }

	        scanner.close();
	    }

	    // Method to check if a number is prime
	    public static boolean isPrime(int n) {
	        if (n <= 1) return false;  // 0 and 1 are not prime
	        if (n == 2) return true;   // 2 is the only even prime
	        if (n % 2 == 0) return false; // eliminate even numbers

	        // Only check up to square root of n
	        for (int i = 3; i <= Math.sqrt(n); i += 2) {
	            if (n % i == 0) return false;
	        }

	        return true;
	    }
	}
