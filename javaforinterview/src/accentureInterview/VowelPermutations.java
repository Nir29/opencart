package accentureInterview;

import java.util.Scanner;

public class VowelPermutations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr a name=");
		String name=sc.nextLine();
		char[]C=name.toCharArray();
		int count=0;
		for(char c:C) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
