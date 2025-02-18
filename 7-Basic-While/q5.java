

import java.util.*;
class loop{
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number = ");
		int num = sc.nextInt();
		
		while (num > 0){
			if (num >= 1)
				System.out.println(num + " days remaining");
			else if (num == 0)
				System.out.println(num + " days remaining. Assignment Overdue");
			num--;
		}
	}
}
