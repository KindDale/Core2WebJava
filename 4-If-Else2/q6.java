
import java.util.*;
class age {
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number = ");
		int num = sc.nextInt();
		
		while (num <= 0){
			System.out.println("Invalid age Re-Enter positive value");
			num = sc.nextInt();
		}

		if (num >= 18)
			System.out.println("Eligible for Voting");
		else
			System.out.println("Ineligible for voting");
	}
}
