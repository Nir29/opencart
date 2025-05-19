package stringInerviewQ;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name=");
		String name=sc.nextLine();
		String reverse="";
		for(int i=name.length()-1;i>=0;i--) {
			reverse=reverse+name.charAt(i);
		}
		System.out.println(reverse);
sc.close();
	}

}
