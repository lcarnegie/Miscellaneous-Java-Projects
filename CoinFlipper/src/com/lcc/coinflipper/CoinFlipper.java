package com.lcc.coinflipper;

public class CoinFlipper {

	public static void main(String[] args) {
		int heads = 1; 
		int tails = 2; 
		int number = (int) (Math.random() * 2);
		if (number == heads) {
			System.out.println("Heads");
		} else {
			System.out.println("Tails");
		}

	}

}
