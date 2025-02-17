
import java.util.*;
class marks {
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter marks = ");
		float percent = sc.nextFloat();
		
		if (percent >= 85)
			System.out.println("Passed with Distinction");
		else if (percent >= 75)
			System.out.println("Passed with First Class");
		else if (percent >= 60)
			System.out.println("Passed with Second Class");
		else if (percent >= 54)
			System.out.println("Passed");
		else if (percent >= 40)
			System.out.println("Fail");
			
	}
}
