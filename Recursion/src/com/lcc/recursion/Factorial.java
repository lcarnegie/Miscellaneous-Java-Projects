package com.lcc.recursion;
import java.util.Scanner; 

public class Factorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		System.out.print("Enter a number: ");
		int x = Integer.parseInt(in.nextLine()); 
		int factX = factorial(x); 
		System.out.println(x + " factorial is " + factX);

	}

	private static int factorial(int x) {
		if(x <= 1)
			return 1; 
		return factorial(x-1) * x; 
		
	}

}
