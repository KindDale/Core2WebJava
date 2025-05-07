import java.util.*;

class Demo{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the pattern");
		int size = sc.nextInt();
		
		for(int i = 1; i <= size; i++){
			char ch1 = (char)(64 + size);
			char ch2 = 'A';
			int num = size;
			for(int j = 1; j <= size; j++){

				if(i % 2 != 0){
					System.out.print(j + "" + ch2 + "\t");
					ch2++;
				}else{
					System.out.print(num + "" + ch1 + "\t");
					num--; ch1--;
				}
			}
			System.out.println();
		}
	}
}
