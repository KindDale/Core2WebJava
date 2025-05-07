
import java.util.*;

class Demo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Pattern");
		int size = sc.nextInt();

		int arr[] = new int[size];
		
		for(int i = 1; i <=size; i++){
			int num = i;
			for(int j = 1; j <=size; j++){
				System.out.print(num + "\t");
				num += size;
			}
			System.out.println();
		}
	}
}
