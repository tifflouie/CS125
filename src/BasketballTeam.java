
public class BasketballTeam {

	private String captain;
    static int num_win;
	
	BasketballTeam (String captain) {
		this.captain = captain;
		num_win++;
		//this.num_win = 0;
	}
	
	public String getCaptain () {
		return this.captain;
	}
	
	public int getNumwin () {
		return this.num_win;
	}
	
	public void setNumWin (int num_win) {
		this.num_win = num_win;
	}
	
	public void havewon () {
		num_win++;
		
	}
	
//	public static void printCaptain () {
//		System.out.println("captain");
//	}
//	
}
