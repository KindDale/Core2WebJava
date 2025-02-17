import java.util.*;

class Assi{
public static void main(String[] args){



                Scanner sc = new Scanner(System.in);

                System.out.println("Enter the first number :- ");
                int x = sc.nextInt();

                System.out.println("Enter the second number :- ");
                int y = sc.nextInt();

                sc.close();

                System.out.println("Assignment");

                System.out.println(x+"+=3"+" = "+ (x+=3));
		System.out.println(x+"-=3"+" = "+ (x-=3));
		System.out.println(x+"*=3"+" = "+ (x*=3));
		System.out.println(x+"/=3"+" = "+ (x/=3));
		System.out.println(x+"%=3"+" = "+ (x%=3));

                System.out.println(y+"+=3"+" = "+ (y+=3));
		System.out.println(y+"-=3"+" = "+ (y-=3));
		System.out.println(y+"*=3"+" = "+ (y*=3));
		System.out.println(y+"/=3"+" = "+ (y/=3));
		System.out.println(y+"%=3"+" = "+ (y%=3));
	}
}
