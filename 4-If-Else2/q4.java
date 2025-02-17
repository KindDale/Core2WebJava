
import java.util.*;
class career {
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter percentage = ");
		float percent = sc.nextFloat();
		
		if (percent > 85.00)
			System.out.println("Medical");
		else if (percent <= 85 && percent >75)
			System.out.println("Engineering");
		else
			System.out.println("Retry");
	}
}
