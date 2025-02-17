
import java.util.*;
class ok {
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.print("Select any 1 plan\n");
		System.out.println("1. Platinum\n2. Gold\n3. Silver\n4. Bronze");
		int ch = sc.nextInt();
		
		if (ch == 1)
			System.out.println("799 for Platinum");
		else if (ch == 2)
			System.out.println("599 for Gold");
		else if (ch == 3)
			System.out.println("399 for Silver");
		else if (ch == 4)
			System.out.println("199 for Bronze");
		else	
			System.out.println("The plan below 199 is free");

	}
}
