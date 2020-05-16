
public class MySubtraction {

	public static int sum(int first, int second) {

		int answer = 0;
		System.out.println("int sum");
		answer = first + second;
		return answer;

	}

	public static double sum(double first, double second) {

		double answer = 0;
		System.out.println("double sum");
		answer = first + second;
		return answer;

	}
	
	public static double sum(double first, double second, int third) {
		
		double answer = 0;
		System.out.println("triple sum");
		answer = first + second + third;
		return answer;
		
	}
	
	public static int sum(int num[]) {

		if (num == null) {
			
			return -1;
		}
		int answer = 0;
		System.out.println("array sum");
		
		
		for (int i : num) {
			answer += i;
		}
		
		/*for (int i = 0; i < num.length; i++) {
			answer += num[i];
		}*/
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value = 5;
		int numbers[] = {1, 2, 3, 4, 5};
		
		System.out.println(sum(value, 6));
		System.out.println(sum(7.2, 8.8));
		System.out.println(sum(7.5, 6.2, 8));
		System.out.println(sum(numbers));
		System.out.println(sum(new int [] {2, 4, 6, 8}));
		System.out.println(sum(null));

	}

}
