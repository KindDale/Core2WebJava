import java.util.*;

class Demo{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Pattern");
		int size = sc.nextInt();

		//char ch = (char)(64 + size);

		for(int i = 1; i <= size; i++){

			char ch = (char)(64 + size);
			for(int j = 1; j <= size; j++){
	
				if(i % 2 != 0)
					System.out.print(ch-- + "\t");
				else
					System.out.print(j + "\t");
			}
			System.out.print("\n");
		}
	}
}
