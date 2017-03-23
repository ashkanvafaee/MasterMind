// Game driver used to run the game
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
