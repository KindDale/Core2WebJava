import java.util.*;
class range {
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number = ");
		int num = sc.nextInt();
		
		System.out.println((num >= 1 && num <= 1000) ? (num + " is in the range of 1 to 1000") : (num + " is not in the range of 1 to 1000"));	
	}
}
