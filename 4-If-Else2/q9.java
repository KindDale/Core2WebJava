
import java.util.*;
class triplet {
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the value of a = ");
		int a = sc.nextInt();
		System.out.print("Enter the value of b = ");
		int b = sc.nextInt();
		System.out.print("Enter the value of c = ");
		int c = sc.nextInt();

		while ((a <= 0) || (b <= 0) || (c <= 0)){
			if (a <= 0){
				System.out.print("a should be greater than 0. Re-Enter value = ");
				a = sc.nextInt();
			}
			if (b <= 0){
				System.out.print("b should be greater than 0. Re-Enter value = ");
				b = sc.nextInt();
			}
			if (c <= 0){
				System.out.print("c should be greater than 0. Re-Enter value = ");
				c = sc.nextInt();
			}

		}
		
		if (((a*a) + (b*b)) == (c*c)){
			System.out.println(a+","+b+" and "+c+" are Pythagorean Triplets");
		} else 
			System.out.println(a+","+b+" and "+c+" are not Pythagorean Triplets");
	}
}
