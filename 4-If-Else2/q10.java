import java.util.*;
class myclass {
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		
		/*System.out.println("Enter the number of Students")
		int stud = sc.nextInt();
		
		while (stud <= 0){
			System.out.print("Invalid Value. Re-Enter the number of students = ");
			stud = sc.nextInt();
		}*/		
		
		String name; int roll; float marks;
		//for (int i = 1; i <= stud; i++)
			
			System.out.print("Enter the name of the 1st student = ");
			name = sc.next();
			System.out.print("Enter Roll number = ");
			roll = sc.nextInt();
			System.out.print("Enter marks = ");
			marks = sc.nextFloat();

		System.out.println("\nStudent data is as follows\n");

		//for (int i = 1; i <= stud ; i++)
			System.out.println("Name - "+name);
			System.out.println("Roll no. - "+roll);
			System.out.println("Marks - "+marks);
	}
}
