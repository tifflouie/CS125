package ch2;

import java.util.Scanner;

public class CostOfDriving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ask for driving distance
		//miles per gallon
		//price per gallon
		//total driving cost
		
		//(900.5/25.5) * 3.55
		
		System.out.println("What's your driving distance?");
		Scanner scanner = new Scanner(System.in);
		double driving_distance = scanner.nextDouble();
		
		System.out.println("How many miles per gallon?");
		double miles_per_gallon = scanner.nextDouble();
		
		System.out.println("What is the price per gallon?");
		double price_per_gallon = scanner.nextDouble();
		
		double total_cost = (driving_distance / miles_per_gallon) * price_per_gallon;
		
		System.out.println("The total price is " + total_cost);
	}

}
