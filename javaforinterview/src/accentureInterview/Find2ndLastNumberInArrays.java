package accentureInterview;

public class Find2ndLastNumberInArrays {

	public static void main(String[] args) {
		int a[]= {30,15,20,45,60,10};
		int smallest=Integer.MAX_VALUE;
		int secondsmallest=Integer.MAX_VALUE;
		for(int num:a) {
			if(num<smallest) {
				secondsmallest=smallest;
				smallest=num;
			}
			else if(num<secondsmallest && num!=smallest) {
				secondsmallest=num;
			}
			
		}
		System.out.println("2nd num"+secondsmallest);
	}

}
