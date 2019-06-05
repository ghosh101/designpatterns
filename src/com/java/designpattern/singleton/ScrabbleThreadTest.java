package com.java.designpattern.singleton;

public class ScrabbleThreadTest {

	public static void main(String[] args) {
		Runnable thread1 = new GetTheTiles();
		Runnable thread2 = new GetTheTiles();
		
		new Thread(thread1).start();
		new Thread(thread2).start();
	}

}
