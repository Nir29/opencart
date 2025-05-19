package stringInerviewQ;

public class ReverseAstring {

	public static void main(String[] args) {
		String input="selenium";
		String rev="";
		for(int i=input.length()-1;i>=0;i--) {
			char l=input.charAt(i);
			rev=rev+l;
		}
		System.out.println(rev);
		//using stringbuffer;
		
		String s="mama";
		StringBuffer sb=new StringBuffer(s);
		
		sb.reverse();
		System.out.println(sb);
		
		
		//using string builder
		
		String a="crow";
		StringBuilder sl=new StringBuilder(a);
	//	sl.append(a);
		sl.reverse();
		System.out.println(sl);
		

	}

}
