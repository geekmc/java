package com.factor.java;

public class BlueBalPen extends BallPen{

	@Override
	public PenCore getPenCore() {
			
		return new BluePenCore();
	}

}
