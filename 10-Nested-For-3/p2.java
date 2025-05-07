import java.util.*;

class Demo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Pattern");
		int size = sc.nextInt();

		int arr[] = new int[size];
		int num = size * (size + 1);
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				System.out.print(num-- + "\t");
			}
			System.out.println();
		}
	}
}
