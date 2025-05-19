package stringInerviewQ;

import java.util.Scanner;

public class LargestNumberIn3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first num=");
		int frstnum=sc.nextInt();
		System.out.println("enter 2nd num=");
		int secnum=sc.nextInt();
		System.out.println("enter 3rd num=");
		int thrdnum=sc.nextInt();
		int res=(frstnum>secnum && frstnum>thrdnum)?frstnum:(secnum>thrdnum)?secnum:thrdnum;
		System.out.println(res);
	}

}
