
public class CheckEmailAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if it ends with @gmail.com say this is an google gmail address
		
		String email = "tacos@@gmail.com";
		
		if (email.endsWith("@gmail.com")) {
			System.out.println("This is a google gmail address");
		}
		
		int count = 0;
		char a = '@';
		
		for (int i = 0; i < email.length(); i++) {
			
			if (email.charAt(i) == a) {
				++count;
			}
		}
		
		
		System.out.println(count);
		
		//if ((2 > count) && (count > 0)) {
			
		if (count >= 2) {
			System.out.println("This is a invalid email");
		}
		
		else {
			System.out.println("valid email");
		}
		
	}

}
