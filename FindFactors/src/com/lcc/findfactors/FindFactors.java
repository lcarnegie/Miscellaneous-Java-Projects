package com.lcc.findfactors;

import java.util.Scanner;

public class FindFactors {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int n = Integer.parseInt(in.nextLine());
		System.out.println("The factors of " + n + " are:");
		for(int i = 1; i<1000 ;i++) {
			if(n % i == 0) {
				System.out.println(n/i + ", " + i);
		}

	}

}
}
