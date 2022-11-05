package beginner;

public class ScopeDemo {

	public static void main(String[] args) {
		int x; // variable known to all code within MAIN

		x = 10;

		if (x == 10) { // from these curly braces we start a new scope

			int y = 20;
			// x and y are both known at this point
			System.out.println(" (line 14)  x and y: " + x + " " + y);
			x = y * 2;
		}
		// y = 100; // Error! y is outside of the scope - End of curly braces

		// x is still know within MAIN at this point
		System.out.println(" (line 20)  x is " + x);
	}

}
