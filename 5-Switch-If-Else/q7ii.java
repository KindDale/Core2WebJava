
import java.util.*;
class ok {
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.print("Select any 1 plan\n");
		System.out.println("1. Platinum\n2. Gold\n3. Silver\n4. Bronze");
		int ch = sc.nextInt();
		switch (ch){
			case 1:	
				System.out.println("799 for Platinum");
				break;
			case 2:
				System.out.println("599 for Gold");
				break;
			case 3:
				System.out.println("399 for Silver");
				break;
			case 4:
				System.out.println("199 for Bronze");
				break;
			default:
				System.out.println("The plan below 199 is free");
		}
	}
}
