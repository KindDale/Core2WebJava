
import java.util.*;
class ok {
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter 1st number = ");
		int num = sc.nextInt();
		System.out.print("Enter 2nd number = ");
		int num2 = sc.nextInt();
		System.out.println("Enter your operation (+,-,*,/,%)");
		char ch = sc.next().charAt(0);
		
		switch(ch){	
			case '+':
				System.out.println("Addition is = "+(num + num2));
				break;
			case '-':	
				System.out.println("Subtraction is = "+(num-num2));
				break;
			case '*':	
				System.out.println("Multiplication is = "+(num*num2));
				break;
			case '/':	
				System.out.println("Division is = "+(num/num2));
				break;
			case '%':	
				System.out.println("Remainder is = "+(num%num2));
				break;
			default:	
				System.out.println("Enter valid operation");
		}
	}
}
