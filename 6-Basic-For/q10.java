import java.util.*;
class loop {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int count = 0;

		for (int i = 1; i <= num; i++){
			if (i % 2 == 0)
				count++;
		}

		System.out.println("Total odd numbers from 1 to "+num+" are = "+count);
	}
}
