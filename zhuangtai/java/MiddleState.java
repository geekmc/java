package com.zhuangtai.java;

public class MiddleState implements TempreatureState{
	double n=15;
	
	
	
	public MiddleState(int n) {
		if(n>0&&n<26)
		this.n = n;
	}



	@Override
	public void showTemperature() {
		System.out.println("现在是温度是"+n+"属于正常温度");
	}

}
