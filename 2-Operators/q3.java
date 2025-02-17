
import java.util.*;

class Logi{
public static void main(String[] args){



                Scanner sc = new Scanner(System.in);

                System.out.println("Enter the first boolean :- ");
                boolean x = sc.nextBoolean();

                System.out.println("Enter the second boolean :- ");
                boolean y = sc.nextBoolean();

		sc.close();

                System.out.println("Logicals");

                System.out.println("Logical AND = " + (x&&y));
		System.out.println("Logical OR = " + (x||y));
		System.out.println("Logical NOT for first = ");
		System.out.println("Logical NOT for second = " + (!y));
        }
}
