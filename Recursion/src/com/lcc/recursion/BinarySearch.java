package com.lcc.recursion;

import java.util.Scanner; 

public class BinarySearch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int[] arr = new int[5]; 
		populate(arr); 
		System.out.print("What number are you looking for?: ");
		int look = Integer.parseInt(in.nextLine()); 
		int num = binarySearch(arr, look); 
		

	}

	private static int binarySearch(int[] arr, int look) {
		int low = 0; 
		int high = arr.length - 1; 
		
		return -1;
	}

	private static int[] populate(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1; 
		}
		return arr; 
		
	}

}
