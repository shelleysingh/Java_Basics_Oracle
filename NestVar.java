package beginner;

public class NestVar {

	public static void main(String[] args) {
		int count;

		for (count = 0; count < 10; count = count + 1) {
			System.out.println(" (line 9)   This is the value of count:  " + count);

			int counter; // Changed 'count' to 'counter' as count throws up an error
			for (counter = 0; counter < 2; counter++)
				System.out.println(" (line 13)  This program doesn't compile with count");
		}

	}

}
