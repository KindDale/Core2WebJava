
import java.util.*;
class demo{
	static public void main(String ards[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Pattern = ");
		int size = sc.nextInt();	

		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				System.out.print(i + 1 + "\t");
			}
			System.out.print("\n");
		}
	}
}
