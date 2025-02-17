import java.util.*;


class Case{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter the Chareter :- ");
                char x = sc.next().charAt(0);

                sc.close();
                if(x>='A' && x<='Z'){
                        System.out.println("The Charecter "+ x +" is Uppercase");
                }else if (x>='a' && x<='z'){
                        System.out.println("The number "+ x +" is Lowercase");
                }else{
			System.out.println("The number "+ x +" is not alphabet");
		}

        }
}
