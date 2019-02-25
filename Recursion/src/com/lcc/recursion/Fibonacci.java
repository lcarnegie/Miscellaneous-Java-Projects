package com.lcc.recursion;

public class Fibonacci {

	public static void main(String[] args) {
		int[] fibArr = new int[25]; 
		fibArr[1] = 1; 
		for(int i = 2; i < fibArr.length; i++) {
			fibArr[i] = fibArr[i-1] + fibArr[i-2]; 
			
		}
		for(int i = 0; i < fibArr.length; i++) {
			System.out.printf("%4d", fibArr[i]); 
		}

	}



}
