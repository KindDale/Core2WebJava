
import java.util.*;
class ok {
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter 1st number = ");
		int num = sc.nextInt();
		System.out.print("Enter 2nd number = ");
		int num2 = sc.nextInt();

		while (num < 0 || num2 < 0){
			if (num < 0){
				System.out.println("Invalid number Re-Enter the 1st number");
				num = sc.nextInt();
			}
			if (num2 < 0){
				System.out.println("Invalid number. Re-Enter the 2nd number");
				num2 = sc.nextInt();
			}
		}	
		int count = 1;
		if ((num*num2) % 2 == 0){
			count++;
		}

		switch(count){
			case 1:
				System.out.println((num*num2)+" is odd");
				break;
			case 2:
				System.out.println((num*num2)+" is even");
				break;
		}

	}
}
