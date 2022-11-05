package beginner;

public class VarInitDemo {

	public static void main(String[] args) {
		int x;
		
		for (x = 0; x < 3; x++) {
			int y = -1; 	// y is initalised in the block - nested scope
			System.out.println(" (line 10)  y is:  " + y); // this always prints -1 // see line 9
			y = 100;
			System.out.println(" (line 12)  y is now:  " + y);
		}

	}

}
