import java.util.*;
class Demo{

	public static void main(String[] args){

 	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no. of Rows:");

	int rows= sc.nextInt();
	int cols= rows;

	System.out.println("Pattern is as Follows:");

	for(int i=0;i<rows;i++){
	int num=1+i;	

		for(int j=1;j<=cols;j++){
		
			if(j%2!=0){
				
				int mult=num*num*num;
				System.out.print(mult+" ");
			}else{
			
				System.out.print(num+" ");
			}
			num++;
		}
		System.out.println();
	}
	}
}
