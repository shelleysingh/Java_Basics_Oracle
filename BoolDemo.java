package beginner;

public class BoolDemo {

	public static void main(String[] args) {
		boolean b;
		b = false;
		System.out.println(" (line 8)   b is   " + b);
		b = true;
		System.out.println(" (line 10)  b is   " + b);

		if (b)
			System.out.println(" (line 13)  This is executed !");

		b = false;
		if (b)
			System.out.println(" (line 17)  This is not executed !=");

		System.out.println(" (line 19)  10 > 9 is " + (10 > 9));

	}

}
