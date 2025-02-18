import java.util.*;
class positive {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int x = sc.nextInt();
		System.out.println((x > 0) ? (x + " is Positive number") : (x + " is Negative number")); 
	}
}
