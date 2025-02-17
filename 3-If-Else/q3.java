

import java.util.*;
class num {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int x = sc.nextInt();
		System.out.println((x > 10) ? (x + " is greater than 10") : (x + " is less than 10")); 
	}
}
