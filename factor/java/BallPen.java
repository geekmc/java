package com.factor.java;

public abstract class BallPen {
	public BallPen() {
		System.out.println("生产了一只装有"+getPenCore().color+"笔芯的圆珠笔");
	}
	public abstract PenCore getPenCore();
	
}
