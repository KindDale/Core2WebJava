import java.util.*;
class Demo{

	public static void main(String[] args){

 	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no. of Rows:");

	int rows= sc.nextInt();
	int cols= rows;

	System.out.println("Pattern is as Follows:");

	for(int i=rows;i>=1;i--){

	int num=i;
	
		for(int j=0;j<cols;j++){
		
			System.out.print(num + " ");
			num=num+3;
		}
		System.out.println();
	}
	}
}
