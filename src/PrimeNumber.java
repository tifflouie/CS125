
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers[] = { 127 };

		for (int i = 0; i < numbers.length; i++) {

			if ((numbers[i] == 1) || (numbers[i] == 2) || (numbers[i] == 3)) {
				
				System.out.println("Prime number: " + numbers[i]);
			} 
			
			int max = numbers[i] / 2;
			for (int j = 2; j < max; j++) {
				
				if ((numbers[i] % j)== 0) {
					System.out.println("Not a prime number: " + numbers[i] + "j = " + j);
					break;
				}
				System.out.println("--> " + j);
			}
		}

	}

}
