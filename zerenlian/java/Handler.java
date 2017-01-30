package com.zerenlian.java;

public interface Handler {
	public abstract void computerMultiply(String number);
	public abstract void setNextHandler(Handler handler);
	
}
