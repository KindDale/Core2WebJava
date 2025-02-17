
import java.util.*;
class ok {
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Grade among O, A, B,C and F");
		char ch = sc.next().charAt(0);
		System.out.println(ch);
		
		switch(ch){
			case 'O':
				System.out.println("Outstanding");
				break;
			case 'A': 
				System.out.println("Excellent");
				break;
			case 'B':
				System.out.println("Good");
				break;
			case 'C':
				System.out.println("Alright");
				break;
			default:	
				System.out.println("Fail");
		}

	}
}
