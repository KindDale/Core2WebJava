import java.util.*;
class Demo{

	public static void main(String[] args){

 	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no. of Rows:");

	int rows= sc.nextInt();
	int cols= rows;

	System.out.println("Pattern is as Follows:");

	int num=1;
	for(int i=0;i<rows;i++){
	
		for(int j=0;j<cols;j++){
			
			System.out.print(num+" ");
			num++;
		}
		num--;
		System.out.println();
	}
	}
}
