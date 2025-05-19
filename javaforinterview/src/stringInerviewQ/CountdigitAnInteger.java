package stringInerviewQ;

public class CountdigitAnInteger {

	public static void main(String[] args) {
		long l=1236447894;
		int a=4545;
		int count=0;
		while(l!=0) {
			l=l/10;
			count++;
		}
System.out.println(count);

String num=Integer.toString(a);
System.out.println(num.length());
	}

}
