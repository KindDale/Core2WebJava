
import java.util.*;
class ok {
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter size");
		String str = sc.next();

		if (str.equals("S"))
			System.out.println("Small");
		else if (str.equals("M"))
			System.out.println("Medium");
		else if (str.equals("L"))
			System.out.println("Large");
		else if (str.equals("XL"))
			System.out.println("Extra Large");
		else
			System.out.println("Invalid Size");
	}
}
