
public class Die {
	int numSides; 
	public Die() {
		numSides = 6; 
	}
	public Die(int numSides) {
		this.numSides = numSides; 
	}
	
	public int roll(){
		return (int)(Math.random() * numSides + 1); 
	}
}
