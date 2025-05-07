import java.util.*;

class Demo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the pattern");
		int size = sc.nextInt();
		int num = size;
		//char ch = (char)(64 + num);
		for(int i = 1; i <=size; i++){
			for(int j = 1; j <= size; j++){
				if(i % 2 == 1){	
					char ch = (char)(64 + num);
					System.out.print(ch + "\t");
				}else{
					System.out.print(num + "\t");
				}
			}
			num--;
			System.out.println();
		}
	}
}
