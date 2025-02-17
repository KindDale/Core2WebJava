
import java.util.*;
class three{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int x = sc.nextInt();
		System.out.println(((x % 3 == 0) && (x % 7 == 0))? (x + " is divisuble by 3 and 7") : (x + " is not divisible by 3 and 7")); 
	}
}
