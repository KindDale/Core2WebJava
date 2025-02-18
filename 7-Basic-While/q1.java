import java.util.*;
class loop{
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number = ");
		int num = sc.nextInt();
		int i = 100;
		while (i < (100 + num)){
			System.out.println(i);
			i++;
		}
	}
}
