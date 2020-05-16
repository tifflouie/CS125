
public class ConvertPhoneNumberFormat {

	public static String convertPhoneFormat(String phoneNumber) {
		
		String[] tempPhoneNumber = phoneNumber.split("-");
		int tempPhone = (Integer.parseInt(tempPhoneNumber[0]) + 1 );
		String newFormat = "(" + tempPhone + ") " + tempPhoneNumber[1] + " - " + tempPhoneNumber[2];
		
		return newFormat;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String phoneNumber = "123-456-7890";
		
		System.out.println(convertPhoneFormat(phoneNumber));
	}

}
