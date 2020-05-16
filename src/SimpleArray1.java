
public class SimpleArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] multiple = new int[8];
		System.out.println(multiple.length);

		char[] all;
		all = new char[4];

		int sum = 0;
		int[] primes = { 2, 3, 5, 7 };

		for (int i = 0; i < primes.length; i++) {
			System.out.print(primes[i] + " ");
		}

		System.out.println("\n-------");

		for (int prime : primes) {
			System.out.print(prime + " ");

			sum += prime;

		}
		System.out.println("\nSum: " + sum);

	}

}
