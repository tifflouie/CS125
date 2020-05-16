
public class FindTheGreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers[] = { 2, 68, 4, 13, 10};
		int maximum = numbers[0]; 
		
		for (int i = 1; i < numbers.length; i++) {
			
			if (numbers[i] > maximum) {
				maximum = numbers[i];
			}
			
		}
		
		System.out.println(maximum);
	}

}
