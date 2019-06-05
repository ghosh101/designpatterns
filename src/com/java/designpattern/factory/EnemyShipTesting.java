package com.java.designpattern.factory;

import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String[] args) {

		/*
		 * EnemyShip enemyShip = new UFOEnemyShip();
		 * 
		 * Scanner input = new Scanner(System.in); String enemyShipOption = "";
		 * 
		 * System.out.println("What type of ship? (U / R)"); if(input.hasNextLine()) {
		 * enemyShipOption = input.nextLine();
		 * 
		 * if(enemyShipOption.equals("U")) { enemyShip = new UFOEnemyShip(); }else {
		 * enemyShip = new RocketEnemyShip(); } doStuffEnemy(enemyShip); }
		 */
		
		
		EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
		EnemyShip enemyShip = null;
		
		Scanner input = new Scanner(System.in);
		System.out.println("What type of ship? (U / R / B)"); 
		
		if(input.hasNextLine()) {
			enemyShip = enemyShipFactory.makeEnemyShip(input.nextLine());
			doStuffEnemy(enemyShip);
		}
		
	}

	private static void doStuffEnemy(EnemyShip enemyShip) {
		enemyShip.displayEnemyShip();
		enemyShip.followHeroShip();
		enemyShip.enemyShipShoots();
	}
}
