
public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String password = "tiffany";
		
		System.out.println("My password is " + password);
		System.out.println("Password size is  " + password.length());
		System.out.println("Is my password tiffany " + password.equals("tiffany"));
		System.out.println(password.charAt(0));
		System.out.println(password.concat(" louie"));
		System.out.println(password.endsWith("ny"));
		System.out.println(password.length());
		System.out.println(password.charAt(6));
		System.out.println(password.toUpperCase());
	}

}
