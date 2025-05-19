package accentureInterview;

public class SumOfEvenAndOddInArray {

	public static void main(String[] args) {
		int a[]= {10,13,14,15,16,17,18};
		int sumEven=0;
		int sumOdd=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				sumEven=sumEven+a[i];
				//System.out.println("even"+a[i]);
				//System.out.println("sum of even num is"+sumEven);
			}
			else {
				sumOdd=sumOdd+a[i];
				//System.out.println("odd");
				//System.out.println("sum of odd is"+sumOdd);
			}
			
		}
		System.out.println("sum of even is"+sumEven);
		System.out.println("sum of odd is"+sumOdd);

	}

}
