/*  * EE422C Project 2 (Mastermind) submission by
 * Replace <...> with your actual data. 
 * Ashkan Vafaee
 * av28837
 * Slip days used: 0
 * Spring 2017
 */

package assignment2;

public class Driver {

	public static void main(String[] args) {
		
		if(args.length>0){
			Game g = new Game(args[0].charAt(0)=='1');
			g.runGame();
		}
		
		else{
			Game g = new Game(false);
			g.runGame();
		}
		

	}

}
