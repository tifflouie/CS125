
public class FindDuplicateLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "tiffaaany";
		char c = name.charAt(0);
		
		for (int i = 1; i < name.length(); i++) {
			
			if (name.charAt(i) == c ) {
				System.out.println("Duplicate Character is: " + c);
			}
			
			c = name.charAt(i);
		}
	}

}
