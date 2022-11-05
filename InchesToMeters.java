package beginner;

public class InchesToMeters {

	/*
	 * Conversion of inches to meters - editing gallons to litres
	 */

	public static void main(String args[]) {
		double inches, meters;

		int counter = 0;

		for (inches = 1; inches < 100; inches++) {
			meters = inches * 39.37;
			System.out.println("(line 15)  " + inches + " inches equals " + meters + " meters");

			counter++;

			if (counter == 12) {
				System.out.println();

				counter = 0;
			}
		}
	}

}
