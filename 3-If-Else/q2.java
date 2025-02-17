import java.util.*;


class Pos{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

                System.out.println("Enter the number :- ");
                int x = sc.nextInt();

                //System.out.println("Enter the first boolean :- ");
                //boolean y = sc.nextBoolean();

		sc.close();
		if(x>=0){
			System.out.println("The number "+ x +" is Positive");
		}else{
			System.out.println("The number "+ x +" is Negative");
		}
		
	}
}

