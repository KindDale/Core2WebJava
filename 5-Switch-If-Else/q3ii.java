
import java.util.*;
class ok {
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter size");
		String str = sc.next();
		
		switch(str){
			case "S":
				System.out.println("Small");
				break;
			case "M":
				System.out.println("Medium");
				break;
			case "L":	
				System.out.println("Large");
				break;
			case "XL":	
				System.out.println("Extra Large");
				break;
			default:
				System.out.println("Invalid Size");
		}
	}
}
