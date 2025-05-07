
import java.util.*;

class Demo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Pattern");
		int size = sc.nextInt();

		int arr[] = new int[size];
		int num = 1;
		for(int i = 1; i <= size; i++){
			for(int j = 1; j <= size; j++){
				if(j % 2 == 0){
					System.out.print(num * num + "\t");
				}else{
					System.out.print(num * num * num + "\t");
				}
				num++;
			}
			System.out.println();
		}
	}
}
