package javaforinterview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Map {

	public static void main(String[] args) {
		String input = "abcd";
		StringBuilder output = new StringBuilder();

		for (char c : input.toCharArray()) {
		    output.append(c).append(c);
		}
		//----------------------------------------------------//

		System.out.println(output.toString()); 
		String str = "Automation".toLowerCase();
		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : str.toCharArray()) {
		    map.put(c, map.getOrDefault(c, 0) + 1);
		}

		System.out.println(map); 
		// Output: {a=2, u=1, t=2, o=2, m=1, i=1, n=1}
// Output: aabbccdd

		
	}

}
