package com.lcc.magic8ball;
import java.util.Scanner; 

public class MagicEightBall {
	
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in); 
	boolean finished = false; 
	System.out.println("Welcome to the Magic 8-Ball!");
	System.out.println("Using the magical powers of the underworld, wizardry, and the Java© programming language, \nthis oracle uses an advanced algorithm to divine your future, all with the simple click of a button.");

		System.out.print("What is your question?: ");
		while(!finished) {
		String inpoot = in.nextLine();
		if(inpoot.equals("quit") || inpoot.equals("ciao") || inpoot.equals("goodbye") || inpoot.equals("bye")) {
			System.out.println("Thank you for using my services. Have a nice day!");
			return; 
		}else {
		divine(inpoot); 
		System.out.print("Do you have another question?: ");
		}
		}
	}

	private static void divine(String inpoot) {
		String reply = "My reply is: ";
		int fate = (int)(Math.random() * 20) + 1; 
		if(fate == 1) {
			System.out.println(reply + "Concentrate and ask again.");
		}else if(fate == 2) {
			System.out.println(reply + "It is certain.");
		}else if(fate == 3) {
			System.out.println(reply + "It is decidedly so.");
		}else if(fate == 4) {
			System.out.println(reply + "Without a doubt.");
		}else if(fate == 5) {
			System.out.println(reply + "Yes - definitely.");
		}else if(fate == 6) {
			System.out.println(reply + "You may rely on it.");
		}else if(fate == 7) {
			System.out.println(reply + "As I see it, yes.");
		}else if(fate == 8) {
			System.out.println(reply + "Most likely.");
		}else if(fate == 9) {
			System.out.println(reply + "Outlook good.");
		}else if(fate == 10) {
			System.out.println(reply + "Yes.");
		}else if(fate == 11) {
			System.out.println(reply + "Signs point to yes.");
		}else if(fate == 12) {
			System.out.println(reply + "Don't count on it.");
		}else if(fate == 13) {
			System.out.println(reply + "My reply is no.");
		}else if(fate == 14) {
			System.out.println(reply + "My sources say no.");
		}else if(fate == 15) {
			System.out.println(reply + "Outlook not so good.");
		}else if(fate == 16) {
			System.out.println(reply + "Very doubtful.");
		}else if(fate == 17) {
			System.out.println(reply + "Reply hazy, try again.");
		}else if(fate == 18) {
			System.out.println(reply + "Better not tell you now.");
		}else if(fate == 19) {
			System.out.println(reply + "Cannot predict now.");
		}else {
			System.out.println(reply + "Ask again later.");
		}
		
	}

}
