package com.factor.java;

public abstract class BallPen {
	public BallPen() {
		System.out.println("������һֻװ��"+getPenCore().color+"��о��Բ���");
	}
	public abstract PenCore getPenCore();
	
}
