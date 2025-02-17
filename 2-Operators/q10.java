
class opera {
	public static void main (String args[]) {
		int x = 10;
		System.out.println("Unary");
		System.out.println(x++);
		System.out.println(++x);
		System.out.println(x--);
		System.out.println(--x);	
		
		
		System.out.println("Binary");
		System.out.println(x+=5);
		System.out.println(x-=5);
		System.out.println(x*=5);
		System.out.println(x/=5);
		int y = 20;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(y / x);
		System.out.println(y % x);
		System.out.println(x > y);
		System.out.println(x < y);
		System.out.println(x >= y);
		System.out.println(x <= y);
		System.out.println(x == y);
		System.out.println(x != y);
		
		System.out.println("Bitwise");
		System.out.println(x >> y);
		System.out.println(x << y);
		System.out.println(x ^ y);

		boolean a = true, b = false;
		System.out.println("Logical");
		System.out.println(a && b);
		System.out.println(a || b);
		System.out.println(!a);
		System.out.println(!b);

	}
}
