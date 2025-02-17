
import java.util.*;
class table {
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number = ");
		int num = sc.nextInt();
		System.out.println((num % 13 == 0) ? (num + " is in the table of 13") : (num + " is not in the table of 13"));
	}
}
