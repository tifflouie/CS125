
public class SimpleBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int search = 8;
		int numbers[] = {2, 4, 5, 6, 6, 7, 8};
		for (int i = 0; i < numbers.length; i++) {
			
			if (numbers[i] == search) {
				System.out.println("Found");
				break;
			}
			System.out.println("Not Found " + numbers[i]);
	     }
		System.out.println("Done");
		
	}

}
