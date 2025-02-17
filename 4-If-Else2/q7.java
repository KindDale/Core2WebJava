
import java.util.*;
class profit {
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Selling price = ");
		int sp = sc.nextInt();
		System.out.print("Enter Cost price = ");
		int cp = sc.nextInt();
		
		while ((cp <= 0) || (sp <= 0)){
			if (cp <= 0){
				System.out.print("Invalid Cost Price Re-Enter Value = ");
				cp = sc.nextInt();
			}

			if (sp <= 0){
				System.out.println("Invalid Selling Price Re-Enter Value = ");
				sp = sc.nextInt();
			}
		}
		if ((sp - cp) > 0)
			System.out.println("Profit of = " + (sp - cp));
		else if ((sp - cp) < 0)
			System.out.println("Loss of = " + (sp-cp));
		else if ((sp - cp) == 0)	
			System.out.println("No Profit no Loss");	
	}
}		
