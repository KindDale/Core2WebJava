
import java.util.*;
class seven{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int x = sc.nextInt();
		System.out.println((x % 7 == 0) ? (x + " is divisible by 7") : (x + " is not divisible by 7")); 
	}
}
