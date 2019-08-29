package com.lcc.TipCalc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String decision;
		boolean again = true;

		while (again) {
			double sumToPay;
			int amount = 0;
			double percent = 0;
			Scanner in = new Scanner(System.in);
			System.out.print("How much was the thing/service you bought?: ");
			try {
				amount = Integer.parseInt(in.nextLine());
			} catch (Exception e) {
				System.out.println("How much was the thing/service you bought?: ");
			}
			System.out.println("How much percent tip do you want?: ");
			try {
				percent = Double.parseDouble(in.nextLine());
			} catch (Exception e) {
				System.out.println("How much percent tip do you want?: ");
			}
			double percentage = percent / 100;
			double tip = amount * percentage; 
			sumToPay = amount + tip;
			System.out.println("You should pay " + sumToPay + ".");
			System.out.println(percent + "% of " + amount + " is " + tip);
			System.out.println();
			System.out.print("Would you like to calculate again? Type Y or N: ");
			decision = in.next();
			if(decision.toLowerCase().equals("y")) {
				System.out.println(); 
			}if (decision.toLowerCase().equals("n")) {
				again = false;
				System.out.println("Thank you, goodbye!");
			}
		}

	}

}
