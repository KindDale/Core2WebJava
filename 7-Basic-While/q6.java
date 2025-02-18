
import java.util.*;
class loop{
	public static void main (String args[]){
		char ch = 'A';

		while (ch <= 'Z'){
			if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U')
				System.out.println(ch);
			ch++;
		}
	}
}
