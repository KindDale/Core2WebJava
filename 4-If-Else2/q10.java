
import java.util.*;
class ok {
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Grade among O, A, B,C and F");
		char ch = sc.next().charAt(0);
		System.out.println(ch);

		if (ch == 'O' || ch == 'o')
			System.out.println("Outstanding");
		else if (ch == 'A' || ch == 'a')
			System.out.println("Excellent");
		else if (ch == 'B' || ch == 'b')
			System.out.println("Good");
		else if (ch == 'C' || ch == 'c')
			System.out.println("Alright");
		else if (ch == 'f' || ch == 'F')
			System.out.println("Fail");

	}
}
