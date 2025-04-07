import java.util.*;
class Demo{

	public static void main(String[] args){

 	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no. of Rows:");

	int rows= sc.nextInt();
	int cols= rows;

	System.out.println("Pattern is as Follows:");

	for(int i=0;i<rows;i++){
	char ch=97 + rows;

		for(int j=0;j<cols;j++){
		
			System.out.print(ch + " ");
			ch--;
		}
		System.out.println();
	}
	}
}
