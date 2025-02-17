import java.util.*;
class ok {
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a colour");
		String str = sc.next();
		System.out.println(str);
		
		if (str.equals("Red")){
			System.out.println("Stop");
		}
		else if (str.equals("Yellow")){
			System.out.println("Get Ready");
		}
		else if (str.equals("Green")){
			System.out.println("Go");
		}
		else{ 
			System.out.println("No colour in Traffic Lights");
	
		}
	}
}
