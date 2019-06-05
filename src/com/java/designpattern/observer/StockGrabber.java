package com.java.designpattern.observer;

import java.util.ArrayList;

public class StockGrabber implements Subject {

	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	public StockGrabber() {
		this.observers = new ArrayList<>();
	}
	
	public void setIBMPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}
	
	public void setAAPLPrice(double aaplPrice) {
		this.aaplPrice = aaplPrice;
		notifyObserver();
	}
	
	public void setGOOGPrice(double googPrice) {
		this.googPrice = googPrice;
		notifyObserver();
	}
	
	@Override
	public void register(Observer o) {
		observers.add(o);
	}

	@Override
	public void unregister(Observer o) {
		int index = observers.indexOf(o);
		System.out.println("Observer " + (index + 1) + " deleted");
		
		observers.remove(index);
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(ibmPrice, aaplPrice, googPrice);
		}

	}

}
