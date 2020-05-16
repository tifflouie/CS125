
public class ReverseStringTest {

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
		
		char[] originalString = input.toCharArray();
		
		char[] reverseString = new char[input.length()];
		int reverseIndex = input.length() - 1;
		
		
		for (int i = 0; i < input.length(); i++, reverseIndex--) {
			
			 reverseString[reverseIndex] = originalString[i];
			 System.out.println(reverseString);
			
		}
		
		System.out.println(reverseString);
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*printMe(null);
		printMe("");
		printMe("Ashley");*/
		
		printMe2("abc");
		printMe2("");
		
	}

}
