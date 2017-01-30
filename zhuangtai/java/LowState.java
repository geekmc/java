package com.zhuangtai.java;

public class LowState implements TempreatureState {
	double n=0;
	

	public LowState(double n) {
		if(n<=0)
		this.n = n;
	}


	@Override
	public void showTemperature() {
			System.out.println("现在的温度是"+n+"属于低温度");
	}

}
