package beginner;

// Difference between Int and Double

public class Int_Dbl {

	public static void main(String[] args) {
		int x;
		double y;
		
		x = 10;
		y = 10.0;
		
		System.out.println(" (line 14) Original value of x: " + x);
		System.out.println(" (line 15) Original value of y: " + y);
		System.out.println(); // /n
		
		x = x / 4;
		y = y / 4;
		
		System.out.println(" (line 21) x after divsion operator:  " + x);
		System.out.println(" (line 22) y after divsion operator:  " + y);
	}

}
