package beginner;

public class CharArithDemo {

	public static void main(String[] args) {
		char ch;

		ch = 'X';
		System.out.println(" (line 9)   ch contains: " + ch);

		ch++; // increment ch as the value Y - how? Unicode values
		System.out.println(" (line 11)  ch is now: " + ch);

		ch = 90; // give ch the value Z - a new Unicode value
		System.out.println(" (line 15)  ch is now: " + ch);
	}

}
