package com.zhuangtai.java;

public class HeightState implements TempreatureState{
	double n=39;
	

	public HeightState(double n) {
		if(n>39)
		this.n = n;
	}


	@Override
	public void showTemperature() {
		System.out.println("现在温度是"+n+"属于高温");
	}

}
