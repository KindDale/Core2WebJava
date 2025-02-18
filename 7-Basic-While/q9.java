
import java.util.*;
class loop{
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter 2 number = ");
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		int sum = 0;
		
		while (num <= num1){
			if (num % 2 == 1){
				sum += num;
			}
			num++;
		}
		System.out.println("Sum of odd numbers = "+sum);
	}
}
