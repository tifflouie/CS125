package ch1;

public class PopulationProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1 birth = 7secs
		//1 death = 13 secs
		//1 immigrant = 45 secs
		//population = 312,032,486
		//Find: population in 5 years
		//Seconds in a year 
		
		int second_in_year = 3600 * 24 * 365;
		int birth = second_in_year / 7;
		int death = second_in_year / 13;
		int immigrant = second_in_year / 45;
		
		
		System.out.println((5 * 60 * 24 * 365) + 312032486);
		System.out.println("In one year there will be " + birth + " " + death + " " + immigrant);
		System.out.println("Still alive = " + (birth + immigrant - death + 312032486));

		
	}

}
