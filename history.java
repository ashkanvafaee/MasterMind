//Implements history functionality: saves past guesses by player and prints past guesses when "HISTORY" entered.

package assignment2;


import java.util.*;

public class history extends boardElements {
	
	int count=0;
	

	public history(boolean b) {
		super(b);
	}
	
	ArrayList <String> past = new ArrayList <String>();

	
	
	public void printPast(){
		for(int i=0;i<count;i++){
		System.out.println(past.get(i));
		}
	}

	public void add(String s){
		past.add(s);
		count++;
	}
}
