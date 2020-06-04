package ch2;

import java.util.Scanner;

public class SumTheDigitInInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//932 -> 9 + 3 + 2 = 14
		//find last digit
		
		System.out.println("Choose a number from 0-1000?");
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		
		int last_digit = number % 10;
		int second_digit = (number / 10) % 10;
		
		//                   932 / 10 -> 93 / 10 -> 9    
		int third_digit = (number / 10) / 10;
		
		int total = last_digit + second_digit + third_digit;
		
		System.out.println(total);
	}

}
