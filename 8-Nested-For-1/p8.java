import java.util.*;
class demo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Pattern = ");
		int size = sc.nextInt();
		char ch = 65;

		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				System.out.print(ch + "\t");
				ch++;
			}
			System.out.println();
		}
	}
}
