
public class ReverseString {

	public static void printMe(String input) {

		if (input != null) {

			char[] forward = input.toCharArray();

			/*
			 * for (char forwards : forward) { System.out.println(forwards); }
			 */

			int start = forward.length - 1;

			for (int i = start; i > -1; i--) {
				// System.out.println(i);
				System.out.println(i + " " + forward[i]);
			}

		} else {
			System.out.println("Don't give me garbage");
		}

	}

	public static void printMe2(String input) {

		char[] forward = input.toCharArray();
		char[] reverse = new char[forward.length];

		for (int i = 0; i < forward.length; i++) {

			int reversedIndex = forward.length - i - 1;
			System.out.println(i + "->" + reversedIndex + " " + forward[i]);
			reverse[reversedIndex] = forward[i];
		}

		System.out.println(reverse);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printMe(null);
		printMe("");
		printMe("Ashley");
		printMe2("testme");
		printMe2("");
	}

}
