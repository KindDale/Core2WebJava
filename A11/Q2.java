
import java.util.*;
class Demo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);	
		System.out.print("Enter the size of the array = ");
		int size = sc.nextInt();

		for(int i = 0; i < size; i++){
			for(int j = 0; j < i + 1; j++){
				System.out.print((j + 1) + "\t");
			}
			System.out.println();
		}		
	}
}
