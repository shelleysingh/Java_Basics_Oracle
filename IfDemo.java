package beginner;

/*
Demonstrate the IF control statement
p.41 java_beginner
*/

class IfDemo {

	public static void main(String args[]) {
		int a, b, c;

		a = 2;
		b = 3;

		if (a < b)
			System.out.println(" a is less than b");
		if (a > b)
			System.out.println(" a is greater than b");
		if (a != b)
			System.out.println(" doesn't print anything - a!=b");

		// Newline
		System.out.println();

		c = a - b;
		System.out.println(" (line 27) c contains the value -1 ");
		if (c <= 0)
			System.out.println(" c is not negative <=");
		if (c < 0)
			System.out.println(" c is negative <");

		// Newline
		System.out.println();

		c = b - a;
		System.out.println(" (line 37) c contains the value 1 ");
		if (c >= 0)
			System.out.println(" c is not negative >=");
		if (c > 0)
			System.out.println(" c is negative >");
	}
}