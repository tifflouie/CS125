
public class SoccerTeamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SoccerTeam tornado = new SoccerTeam( 11, "bronze");
		tornado.setNumPlayers(12);
		tornado.setTeamCaptain("tiffany louie");
		tornado.setLevel("academy");
		
		System.out.println(tornado.getNumPlayers());
		System.out.println(tornado.getTeamCaptain());
		System.out.println(tornado.getLevel());
		
	}

}
