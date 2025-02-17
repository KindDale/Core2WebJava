
import java.util.*;
class divide {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int x = sc.nextInt();
		System.out.println(((x % 2 == 0) && (x % 5 == 0) && (x % 10 == 0)) ? (x + " is divisible by 2,5,10") : (x + " is not divisible by 2,5,10")); 
	}
}
