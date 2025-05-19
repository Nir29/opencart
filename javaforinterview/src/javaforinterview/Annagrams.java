package javaforinterview;

import java.util.Arrays;
import java.util.Scanner;

public class Annagrams {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first input=");
		String s1=sc.nextLine();
		System.out.println("enter second input");
		String s2=sc.nextLine();
		if(checkAnnagram(s1,s2)) {
			System.out.println("strrings are annagram");
		}
		else {
			System.out.println("strings are not annagrams");
		}
		

	}
	
	public static boolean checkAnnagram(String s1,String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1,c2);
	}

}
