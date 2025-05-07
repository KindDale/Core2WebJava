import java.util.*;

class Demo{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Pattern");
		int size = sc.nextInt();

		for(int i = 1; i <= size; i++){
			int num = size;
			for(int j = 1; j <= size; j++){

				if(i % 2 != 0){
					if(j % 2 != 0)
						System.out.print((char)(64 + num) + "\t");
					else if(j % 2 == 0)
						System.out.print(num + "\t");
					num--;
				}else if(i % 2 == 0){

					if(j % 2 != 0)
						System.out.print((char)(64 + j) + "\t");
					else
						System.out.print(j + "\t");
				}
			}
			System.out.print("\n");
		}
	}
}
