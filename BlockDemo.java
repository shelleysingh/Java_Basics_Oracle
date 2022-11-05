package beginner;

/*
 Demonstrate a Block of code or CodeBlock
 */

public class BlockDemo {

	public static void main(String[] args) {
		double i, j, d;

		// i = 5; setting the i to zero skips the block as it is a TRUE boolean value
		i = 0;
		j = 10;

		// The target of this if statement is this block
		if (i != 0) {
			System.out.println(" (line 16) i does not equal zero");
			d = j / i;
			System.out.println(" (line 18) j / i is " + d);
		}

	}

}
