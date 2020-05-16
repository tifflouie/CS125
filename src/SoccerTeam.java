
public class SoccerTeam {

	private int num_players;
	private String level;
	private String team_captain;

	
	SoccerTeam(int num_players, String level) {
		
		this.team_captain = "tiffany";
		this.num_players = num_players;
		this.level = level;
		
	}
	
	public int getNumPlayers() {
		return this.num_players;
	}
	
	public void setNumPlayers(int num_players) {
		this.num_players = num_players;
	}
	
	public String getTeamCaptain() {
		return this.team_captain;
	}
	
	public void setTeamCaptain(String team_captain) {
		this.team_captain = team_captain;
	}

	public String getLevel() {
		return this.level;
	}
	
	public void setLevel(String level) {
		this.level = level;
	}
}
