package beginner;

// This program converts gallons to litres
// page_39 beginners_guide

public class GalToLit {

	public static void main(String[] args) {
		double gallons; // holds the number of gallons
		double litres; // holds conversion to litres

		gallons = 10; // start with 10 gallons

		litres = gallons * 3.7854; // convert to litres

		System.out.println(gallons + " (line16) gallons is " + litres + " litres.");

	}

}
