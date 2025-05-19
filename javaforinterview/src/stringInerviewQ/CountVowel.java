package stringInerviewQ;

public class CountVowel {

	public static void main(String[] args) {
		String s="hello world";
		
		String s1=s.trim();
		System.out.println(s1);
		int vowel=0;
		int consnant=0;
		for(char c:s1.toCharArray()) {
			
			if(c>='a'&&c<='z') {
			
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vowel++;
			}
			else {
				consnant++;
			}
			}
		}
		System.out.println(vowel);
		System.out.println(consnant);

	}

}
