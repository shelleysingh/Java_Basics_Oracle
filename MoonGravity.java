package beginner;

public class MoonGravity {

	public static void main(String[] args) {
		double moon; // holds the number of gallons
		double earth; // holds conversion to litres

		earth = 9.81; // start with 9.81 newtons as earth gravity

		moon = earth * 0.17; // convert to moon gravity

		System.out
				.println("(line16) " + moon + " newtons is moons gravity when " + earth + " newtons is earth's gravity.");

	}

}
