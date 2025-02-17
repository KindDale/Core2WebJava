
import java.util.*;
class ok {
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter a colour");
		String str = sc.next();
		
		switch(str){
			case "Red":
				System.out.println("Stop");
				break;

			case "Green":
				System.out.println("Go");
				break;
			case "Yellow":
				System.out.println("Get Ready");
				break;
			default:
				System.out.println("Not a colour in a traffic light");
		}
	}
}
