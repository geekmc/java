package com.guanchazhe.java;

public interface Subject {
	public void addObserver(Observer o);
	public void deletObserver(Observer o);
	public void notifyObserver();
}
