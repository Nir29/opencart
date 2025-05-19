package stringInerviewQ;

import java.util.Scanner;

public class ReverseWordInAString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a sentence=");
		String sentence=sc.nextLine();
		String revsent="";
		String[]words=sentence.split(" ");
		for(int i=words.length-1;i>=0;i--) {
			revsent=revsent+" "+words[i];
		}
      System.out.println(revsent);
      sc.close();
	}

}
