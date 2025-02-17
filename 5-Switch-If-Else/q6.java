
import java.util.*;
class ok {
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number = ");
		int num = sc.nextInt();
		
		if (num >= 1 && num <= 5){
			if (num == 1)
				System.out.println("One");
			else if (num == 2)
				System.out.println("Two");
			else if (num == 3)
				System.out.println("Three");
			else if (num == 4)
				System.out.println("Four");
			else if (num == 5)
				System.out.println("Five");
		} else 
			System.out.println(num+" is greater than 5");
	}
}
