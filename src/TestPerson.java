
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person tiffany = new Person();
		Person ashley = new Person();
		
		ashley.fullname = "ashley louie";
		ashley.age = 11;
		
		tiffany.fullname = "tiffany louie";
		tiffany.age = 14;
		
		System.out.println(tiffany.printfullName());
		
		System.out.println(ashley.printfullName());

	}

}
