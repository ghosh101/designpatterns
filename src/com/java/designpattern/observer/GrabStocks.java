package com.java.designpattern.observer;

public class GrabStocks {

	public static void main(String[] args) {
		
		StockGrabber stockGrabber = new StockGrabber();
		
		StockObserver stockObserver1 = new StockObserver(stockGrabber);
		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setAAPLPrice(677.60);
		stockGrabber.setGOOGPrice(676.40);
		
		StockObserver stockObserver2 = new StockObserver(stockGrabber);
		stockGrabber.setIBMPrice(187.00);
		stockGrabber.setAAPLPrice(627.60);
		stockGrabber.setGOOGPrice(656.40);
		
		stockGrabber.unregister(stockObserver1);
		stockGrabber.setIBMPrice(187.00);
		stockGrabber.setAAPLPrice(627.60);
		stockGrabber.setGOOGPrice(656.40);
	}

}
