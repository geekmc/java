package com.zhuangtai.java;

public class Application {
		public static void main(String[] args) {
			
				TempreatureState state=new LowState(-12);
				Thermometer thermometer=new Thermometer();
				
				thermometer.setState(state);
				thermometer.showMessage();
				
				state=new MiddleState(20);
				thermometer.setState(state);
				thermometer.showMessage();
				
				state=new HeightState(39);
				thermometer.setState(state);
				thermometer.showMessage();
		}
}
