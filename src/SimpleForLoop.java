
public class SimpleForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int score[] = {1, 4, 9, 8, 13};
		for (int index = 0; index < score.length; index++) {
			//System.out.println(score[index]);
			if ((score[index] % 3 == 0) || (score[index] % 13 ==0)) {
				sum += score[index];
			}
		}
		System.out.println(sum);
		System.out.println("Done");
	}

}
