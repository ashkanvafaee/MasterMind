//Implements the main Game elements and runs the actual games
package assignment2;

import java.util.*;

public class Game {
	
	boolean gameMode;						//testing mode 
	
	
	String historyName = "HISTORY";
	
	
	public Game(boolean b){
		gameMode=b;
	}
	
	public void welcome () {
		System.out.println("Welcome to Mastermind.");
	}
	
	public void prompt() {
		System.out.println("Do you want to play a new game? (Y/N):");
	}

	public void win(){
		System.out.println("You win!");
	}

	public void lose(){
		System.out.print("You lose! The pattern was");
	}

	//Runs games until user exits program
	public void runGame(){
		
		Scanner input = new Scanner(System.in);
		
		
		welcome();
		prompt();
		
		
		String response = input.nextLine();
		
		while (response.charAt(0) =='Y'){
			boolean flagEnd=false;						//If match
			boolean turnsFlag=false;					//if turns shouldn't be decremented
	
			pegs p = new pegs(gameMode);
			p.secretCode = SecretCodeGenerator.getInstance().getNewSecretCode();
		
			history h = new history(gameMode);
		
		
			if(gameMode){
				System.out.println("Secret code: "+ p.secretCode);
			}
		
		
		
		
		
		while(p.turns>0 && flagEnd==false){
			flagEnd = false;							//used to mark win
			turnsFlag=false;
			System.out.println("");
			System.out.println("You have " + p.turns + " guess(es) left.");
			System.out.println("Enter guess:");
			response = input.nextLine();
			
			
			if(!p.invalidGuess(response) && !response.equals(historyName)){		//skip this check if "HISTORY"
				System.out.println("INVALID_GUESS");
				turnsFlag=true;
			}
			
			if(response.equals(historyName)){
				h.printPast();
				turnsFlag=true;
			}
			
			
			if(!turnsFlag){
			p.guess = response;
			if(p.feedback() != "match"){
			System.out.println(p.guess+ " -> " + p.feedback());
			h.add(p.guess+ " -> " + p.feedback());
			}
			
			else {
				flagEnd=true;
			}
			p.nextTurn();
			}
		}
		
		
		
		if(flagEnd==true){
			win();
			System.out.println("");
			prompt();
			response = input.nextLine();
		}
		else{
			lose();
			System.out.println(" " + p.secretCode);
			System.out.println("");
			prompt();
			response = input.nextLine();
		}
		
		
		
		
		
		}
		
		
		
	}
	
}
