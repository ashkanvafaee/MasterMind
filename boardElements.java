// Initializes the game board elements and keeps track of number of player turns left.

package assignment2;

public class boardElements extends Game {
	
	public boardElements(boolean b){
		super(b);
	}

	int turns = GameConfiguration.guessNumber;
	String [] colors = GameConfiguration.colors;
	int pegNumber = GameConfiguration.pegNumber;
	
	public void nextTurn(){
		this.turns--;
	}
}
