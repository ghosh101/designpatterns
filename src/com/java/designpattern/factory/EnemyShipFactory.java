package com.java.designpattern.factory;

public class EnemyShipFactory {

	public EnemyShip makeEnemyShip(String typeOfShip) {
		if(typeOfShip.equalsIgnoreCase("U")) {
			return new UFOEnemyShip();
		}else if(typeOfShip.equalsIgnoreCase("R")) {
			return new RocketEnemyShip();
		}else if(typeOfShip.equalsIgnoreCase("B")) {
			return new BigUFOEnemyShip();
		}else
			return null;
	}
}
