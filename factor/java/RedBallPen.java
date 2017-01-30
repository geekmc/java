package com.factor.java;

public class RedBallPen extends BallPen{
	

	@Override
	public PenCore getPenCore() {
			
		return new RedPencore();
	}
	

}
