package ch2;

import java.util.Scanner;

public class WhatIsToday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ask someone how many days 
		//# of days % 7
		//add the result to the day given
		
		final int sunday = 0;
		final int monday = 1;
		final int tuesday = 2;
		final int wednesday = 3;
		final int thursday = 4;
		final int friday = 5;
		final int saturday = 6;
		
		
		System.out.println("How many days after the day of the week?");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		
		System.out.println("What is day is today?");
		scanner = new Scanner(System.in);
		int day_of_week = scanner.nextInt();
				
				
		//mod to find out the num of days after the day given
		int days_after = input % 7;
		
		
		
		//find out the actual day of the week
		int actual_day = (days_after + day_of_week) % 7;
		
		
		
		if (actual_day == sunday) {
			System.out.println("sunday");
		} else if (actual_day == monday) {
			System.out.println("monday");
		} else if (actual_day == tuesday) {
			System.out.println("tuesday");
		} else if (actual_day == wednesday) {
			System.out.println("wednesday");
		} else if (actual_day == thursday) {
			System.out.println("thursday");
		} else if (actual_day == friday) {
			System.out.println("friday");
		} else if (actual_day == saturday) {
			System.out.println("saturday");
		}
		
		
		
	}

}
