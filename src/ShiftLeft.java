
public class ShiftLeft {

	public static String shiftLeft(String mystring, int shift) {
		
		if (mystring == null) {
			return mystring;
		}
		
		if ((mystring.length() == 1) || (shift == 0)) {
			System.out.println(mystring);
		}
		
		char[] originalArray = mystring.toCharArray();
		char[] newArray = new char[mystring.length()];
		
		for (int i = 0; i < mystring.length(); i++) {	
			newArray[i] = originalArray[ (i + shift) % mystring.length()];
		}
		
		//System.out.println(newArray);
		
		return new String(newArray);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mystring = "daddy";
		int shift = 2;
		
		System.out.println(shiftLeft(mystring,shift));
	}

}
