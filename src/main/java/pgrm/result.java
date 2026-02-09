package pgrm;

public class result {

	public static String display(int n) {
		if(n%2==1)
			return "even";
		else 
			return "odd";
		
	}
	public static void main(String[] args) {
		System.out.println(display(20));
	}
	
}