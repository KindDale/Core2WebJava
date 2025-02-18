
import java.util.*;
class loop{
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number = ");
		int num = sc.nextInt();
		
		while (num > 0){
			System.out.println(num * num);
			num--;
		}
	}
}
