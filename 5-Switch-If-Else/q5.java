
import java.util.*;
class ok{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a month number = ");
		int ch = sc.nextInt();
		
		while (ch <= 0 || ch > 12){
			System.out.print("Invalid month number. Re-Enter value = ");
			ch = sc.nextInt();
		}
		switch(ch) {
			case 1:
				System.out.println("Jan");
				break;
			case 2:
				System.out.println("Feb");
				break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("June");
				break;
			case 7:
				System.out.println("July");
				break;
			case 8:
				System.out.println("August");
				break;
			case 9:
				System.out.println("Sept");
				break;
			case 10:
				System.out.println("October");
				break;
			case 11:
				System.out.println("November");
				break;
			case 12:
				System.out.println("December");
				break;
			default:
				System.out.println("In-valid value value");
				break;
		
		}		
	}
