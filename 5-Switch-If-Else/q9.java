
import java.util.*;
class ok {
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter marks");
		System.out.print("Maths = ");
		int num = sc.nextInt();
		System.out.print("Physics = ");
		int num2 = sc.nextInt();
		System.out.print("Chemistry = ");
		int num3 = sc.nextInt();
		System.out.print("Biology = ");
		int num4 = sc.nextInt();
		System.out.print("English = ");
		int num5 = sc.nextInt();
		
		int count;

		//float total;
		
		if(num > 40 && num2 > 40 && num3 > 40 && num4 > 40 && num5 > 40){
			float total = ((num + num2 + num3 + num4 + num5)/ 500.0f) * 100;	
	
			if (total > 75)
				count = 1;
			else if (total > 60)
				count = 2;
			else if (total > 50)
				count = 3;
			else
				count = 0;

			switch (count){
				default:
					System.out.println("Failed");
					break;
				case 1:
					System.out.println("First Class");
					break;
				case 2:
					System.out.println("Second Class");
					break;
				case 3:
					System.out.println("Pass");
					break;
			}
		} else {
			System.out.println("You Failed the exam");		
		}
	}
}
