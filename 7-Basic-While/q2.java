
import java.util.*;
class loop{
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number = ");
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		int i = num;
		while (i <= num1){
			if (i % 5 == 0)
				System.out.println(i);	
			i++;
		}
	}
}
