package javaforinterview;

public class StringDemo {

	public static void main(String[]args) {
		String s="abcd";
		StringBuilder sb=new StringBuilder(s);
		sb.append(s).append(s);
		System.out.println(sb);
	}

}
