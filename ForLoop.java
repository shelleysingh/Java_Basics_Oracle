package beginner;

public class ForLoop {

	public static void main(String[] args) {
		int count;

		// for (count = -4; count < 5; count = count + 1)
		for (count = 0; count <= 5; count++)
			System.out.println(" (line 10) This is stored in count:  " + count);

		System.out.println(" Done!");
		
		for (count = 5; count >= 0; count--)
			System.out.println(" (line 15) This is stored in count:  " + count);

		System.out.println(" Done! --");
	}

}