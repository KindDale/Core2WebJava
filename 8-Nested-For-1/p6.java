import java.util.*;
class demo{
	public static void main(String rgs[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the pattern = ");
		int size = sc.nextInt();

		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				System.out.print(j+1 + "\t");
			}
			System.out.println();
		}
	}
}
