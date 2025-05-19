package preparation;

import java.util.HashMap;
import java.util.Scanner;

public class Occurance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter input=");
		String input=sc.nextLine();
		String s=input.toLowerCase();
		
		
		HashMap<Character,Integer>map=new HashMap<>();
		for(char c:s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+ 1);
		}
		System.out.println(map);

	}

}
