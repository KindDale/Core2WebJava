
import java.util.*;

class Bit{
public static void main(String[] args){



                Scanner sc = new Scanner(System.in);

                System.out.println("Enter the first number :- ");
                int x = sc.nextInt();

                System.out.println("Enter the second number :- ");
                int y = sc.nextInt();

                sc.close();

                System.out.println("Bit wise ");

                System.out.println(x+"&"+y +" = "+ (x&y));
		System.out.println(x+"|"+y +" = "+ (x|y));
		System.out.println(x+"<<1" +" = "+ (x<<1));
		System.out.println(x+">>1" +" = "+ (x>>1));
	}
}

