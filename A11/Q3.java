

import java.util.*;
class Demo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);	
		System.out.print("Enter the size of the array = ");
		int size = sc.nextInt();

		for(int i = 0; i < size; i++){
			int num = size;
			for(int j = 0; j < i + 1; j++){
				System.out.print(num + "\t");
				num--;
			}
			System.out.println();
		}		
	}
}
