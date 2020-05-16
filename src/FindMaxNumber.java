
public class FindMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int first = 31;
		int second = 20;
		int third = 5;
		int maximum = first;
		
		if ((second < first) && (first > third)) {
			maximum = first;
		} 
		
		if ((second > first) && (second > third)){
			maximum = second;
		}
		if ((third > first) && (third > second)){
			maximum = second;
		}
		
		System.out.println("The maximum number is: " + maximum);
	}
	

}
