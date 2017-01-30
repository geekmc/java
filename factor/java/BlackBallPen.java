package com.factor.java;

public class BlackBallPen extends BallPen{

	@Override
	public PenCore getPenCore() {
		return new BlackPenCore();
	}

}
