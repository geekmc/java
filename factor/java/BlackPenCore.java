package com.factor.java;

public class BlackPenCore  extends PenCore{
	
	public BlackPenCore() {
		color="ºÚÉ«";
	}

	@Override
	public void wirteWord(String s) {
		System.out.println("Ð´³ö"+color+"µÄ×Ö£º"+s);
	}

}
