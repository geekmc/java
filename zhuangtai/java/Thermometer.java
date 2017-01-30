package com.zhuangtai.java;

public class Thermometer {
	TempreatureState state;
	public void showMessage(){
		System.out.println("****");
		state.showTemperature();
		System.out.println("*****");
	}
	public void setState(TempreatureState state){
		this.state=state;
	}

}
