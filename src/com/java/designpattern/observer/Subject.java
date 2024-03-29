package com.java.designpattern.observer;

public interface Subject {

	void register(Observer o);
	void unregister(Observer o);
	void notifyObserver();
}
