import java.util.ArrayList;
import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Player> players = new ArrayList();
		Die dice = new Die(); 
		System.out.print("How many players:");
		int numPlayers = Integer.parseInt(in.next());
		for (int i = 1; i <= numPlayers; i++) {
			System.out.print("What is their name:");
			players.add(new Player(in.next()));
		}
		System.out.print("\nHow many rounds?:");
		int numRounds = Integer.parseInt(in.next()); 
		for(int i = 0; i < numRounds; i ++) {
			for(int j = 0; j < players.size(); j ++){
				turn(players.get(j), dice); 
			}
			
		}
		showWinner(players); 
		
	}

	private static void showWinner(ArrayList<Player> players) {
			Player winner = players.get(0); 
			for(int i = 1; i < players.size(); i++) {
				if(players.get(i).getScore() > winner.getScore())
					winner = players.get(i); 
			}
			System.out.println("Winner: " + winner.getName() + " - " + winner.getScore() + " points!");
		
		
	}

	private static void turn(Player player, Die dice) {
		int score = dice.roll(); 
		player.addScore(score); 
		
	}

}
