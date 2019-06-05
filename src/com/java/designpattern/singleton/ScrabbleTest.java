package com.java.designpattern.singleton;

import java.util.LinkedList;

public class ScrabbleTest {

	public static void main(String[] args) {
		Singleton newInstance1 = Singleton.getInstance();
		System.out.println("Instance 1 ID: " + System.identityHashCode(newInstance1));
		System.out.println(newInstance1.getLetterList());
		LinkedList<String> playerOneTiles = newInstance1.getTiles(7);
		System.out.println("Player 1: " + playerOneTiles);
		System.out.println(newInstance1.getLetterList());
		
		
		Singleton newInstance2 = Singleton.getInstance();
		System.out.println("Instance 2 ID: " + System.identityHashCode(newInstance2));
		System.out.println(newInstance2.getLetterList());
		LinkedList<String> playerTwoTiles = newInstance2.getTiles(7);
		System.out.println("Player 2: " + playerTwoTiles);
		System.out.println(newInstance2.getLetterList());
	}

}
