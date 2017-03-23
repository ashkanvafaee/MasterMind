/*  * EE422C Project 2 (Mastermind) submission by
 * Replace <...> with your actual data. 
 * Ashkan Vafaee
 * av28837
 * Slip days used: 0
 * Spring 2017
 */
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
