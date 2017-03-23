/*  * EE422C Project 2 (Mastermind) submission by
 * Replace <...> with your actual data. 
 * Ashkan Vafaee
 * av28837
 * Slip days used: 0
 * Spring 2017
 */

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
