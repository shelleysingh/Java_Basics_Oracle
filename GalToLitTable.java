package beginner;
/*
 p.47 GalToLitTable.java
 */

public class GalToLitTable {

	public static void main(String[] args) {
		double gallons, liters;
		int counter;

		counter = 0; // initialise the line counter
		
		for (gallons = 1; gallons <= 100; gallons++) {
			liters = gallons * 3.7854;
			System.out.println("(line 14)  " + gallons + "  gallons is " + liters + " liters");
			counter++;
			// every 10th line, print a blank line
			if (counter == 10) {
				System.out.println("(line 19)");
				
				counter = 0; // reset the line counter
			}
		}

	}

}
