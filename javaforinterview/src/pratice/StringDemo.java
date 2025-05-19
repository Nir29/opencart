package pratice;

public class StringDemo {

	public static void main(String[] args) {
		String s="Nirmal";
		String s1=new String("Nirmal");
		System.out.println(s==s1);
		System.out.println(s.equals(s1) );
		
		System.out.println(s.endsWith("l"));
		
		String name="java selenium";
		String s2[]=name.split(" ");
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		System.out.println(s+s1);
		String s3=s1.concat(s2[1]);
		System.out.println(s3);
		
		System.out.println();
		System.out.println(s.charAt(5));
		System.out.println(s.substring(0,3));
		System.out.println(s.indexOf('l'));
		
		

	}

}
