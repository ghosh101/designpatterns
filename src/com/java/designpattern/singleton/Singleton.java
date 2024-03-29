package com.java.designpattern.singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {
	
	public static Singleton firstInstance = null;
	
	private String[] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a",
			            "b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e",
			            "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h",
			            "h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l",
			            "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o",
			            "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r",
			            "r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u",
			            "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z",}; 

	private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(scrabbleLetters));
	
	private static boolean firstThread = true;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(firstInstance == null) {
			if(firstThread) {
				firstThread = false;
				
				try {
					Thread.currentThread();
					Thread.sleep(1000);
				}catch(InterruptedException e) {}
			}
			
			synchronized (Singleton.class) {
				if(firstInstance == null) {
					firstInstance = new Singleton();
					Collections.shuffle(firstInstance.letterList);
				}
			}
			
		}
		return firstInstance;
	}
	
	public LinkedList<String> getLetterList(){
		return firstInstance.letterList;
	}
	
	public LinkedList<String> getTiles(int howManyTiles){
		LinkedList<String> tileList = new LinkedList<>();
		
		for(int i=0; i<howManyTiles; i++) {
			tileList.add(firstInstance.letterList.remove(0));
		}
		return tileList;
	}

}
