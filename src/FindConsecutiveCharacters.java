
public class FindConsecutiveCharacters {
	
	public static void findDuplicates(String input) {

		for (int i = 0; i < input.length() - 1; i++) {

			if (input.charAt(i) == input.charAt(i + 1)) {
				System.out.println(i + 1 + " " + input.charAt(i));
			}
		}
	}

	public static int countDuplicates(String input) {

		int count = 0;
		
		for (int i = 0; i < input.length() - 1; i++) {

			if (input.charAt(i) == input.charAt(i + 1)) {
				++count;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "Mmmississippi";
		// input = input.toUpperCase();

		findDuplicates(word);

		findDuplicates("tiffanytiffany");
		
		int mycount = countDuplicates("ddaaddy");
		System.out.println(mycount);
		
		
	}
	

}
