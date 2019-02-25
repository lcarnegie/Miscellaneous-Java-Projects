
public class Player {
	String name; 
	int score; 
	
	public Player(String playerName){
		name = playerName; 
		score = 0; 
	}
	
	public String getName() {
		return name; 
	}
	
	public void addScore(int addScore) {
		score += addScore; 
	}
	
	public int getScore() {
		return score; 
	}

	

}
