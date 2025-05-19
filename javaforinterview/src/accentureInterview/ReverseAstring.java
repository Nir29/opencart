package accentureInterview;

import java.util.Scanner;

public class ReverseAstring {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter a string:");
		 String input=sc.nextLine();
		 input=input.toLowerCase();
		 String act=input;
		 String rev="";
		 
		 for(int i=input.length()-1;i>=0;i--) {
			 char c=input.charAt(i);
			 rev=rev+c;
		 }
        
        sc.close();
        if(act.equals(rev)) {
        	System.out.println("palindrome");
        }
        else {
        	System.out.println("not palindrome");
        }
	}

}
