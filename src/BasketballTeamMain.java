
public class BasketballTeamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	BasketballTeam.printCaptain();
		
		BasketballTeam lynbrook = new BasketballTeam("tiffany");
		
		System.out.println(lynbrook.getCaptain());
		System.out.println(lynbrook.getNumwin());
		
		lynbrook.havewon();
		lynbrook.havewon();
		
		System.out.println(lynbrook.getNumwin());
		
		BasketballTeam warriors = new BasketballTeam("tiffany louie");
		
		System.out.println(warriors.getNumwin());
		
	}

}
