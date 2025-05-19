package stringInerviewQ;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharactersCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr a string=");
		String str=sc.nextLine();
		findDuplicate( str);

	}
	
	
	public static void findDuplicate(String str) {
		Map<Character,Integer>charCountMap=new HashMap();
		for(char c:str.toCharArray()) {
			if(charCountMap.containsKey(c)) {
				charCountMap.put(c,charCountMap.get(c)+1);
			}
			else {
				charCountMap.put(c,1 );
			}
			
		}
		System.out.println("duplicate character in string is");
		for(Map.Entry<Character, Integer>entry:charCountMap.entrySet()) {
			if(entry.getValue()>1) {
			System.out.println(entry.getKey()+":"+entry.getValue());
			
			}
		}
		
	}

}
