/*  * EE422C Project 2 (Mastermind) submission by
 * Replace <...> with your actual data. 
 * Ashkan Vafaee
 * av28837
 * Slip days used: 0
 * Spring 2017
 */
package assignment2;

public class pegs extends boardElements {

	public pegs(boolean b) {
		super(b);
	}
	
	String secretCode;
	String guess;
	public String getGuess(){
		return this.guess;
	}

	public String getSecret(){
		return this.secretCode;
	}

	public boolean invalidGuess(String response){
		
		if(response.length()!=pegNumber){
			return false;
		}
		
		boolean flag = true;
		
		for(int i=0;i<response.length();i++){
			for(int j=0;j<colors.length;j++){
				if(response.charAt(i)==colors[j].charAt(0)){
					flag=true;
				}	
				
			}
			if(flag==false){
				return(flag);
			}
			
			flag=false;

		}
		
		return true;
		
	}

	public String feedback(){
		int black=0,white=0;								//black -> perfect; white -> color match
		char [] temp = new char [guess.length()];
		char [] tempGuess = new char[secretCode.length()];
		
		for(int i=0;i<guess.length();i++){
			temp[i] = guess.charAt(i);
		}
		
		for(int i=0;i<secretCode.length();i++){
			tempGuess[i] = secretCode.charAt(i);
			}
		
		
		for(int i=0;i<guess.length();i++){
			if(temp[i]==tempGuess[i]){
				black++;
				temp[i] = 0;						//unmatching values
				tempGuess[i] = 1;
			}
		}
		
		for(int i=0;i<guess.length();i++){
			for(int j=0;j<guess.length();j++){
				if(temp[i]==tempGuess[j]){
					white++;
					temp[i]=0;
					tempGuess[j]=1;
				}
			}
		}
		
		if(black==guess.length()){						// perfect guess
			System.out.println(guess + " -> " + "4b_0w");
			return("match");
		}
		
		return(black + "b_" + white + "w");
	}
	
}
