package com.adapter.java;

public class Application {
			public static void main(String[] args) {
				ThreeElectricOutlet outlet;
				Wash w=new Wash();
				outlet=w;
				System.out.println("使用三相插座：");
				outlet.connectElectricCurrent();
				TV t=new TV();
				TreeElectricAdapter adapter=new TreeElectricAdapter(t);
				outlet=adapter;
				System.out.println("使用三相插座");
				outlet.connectElectricCurrent();
			}
}
class Wash implements ThreeElectricOutlet{
	String name;
	Wash(){
		name="黄河洗衣机";
	}
	

	public Wash(String s) {
			name=s;
	}
	

	@Override
	public void connectElectricCurrent() {
			turnOn();
	}


	public void turnOn() {
		System.out.println(name+"starting.....");
	}
}
class TV implements TwoElectricOutlet{
	String name;
	TV(){
		name="长江电视";
		
	}
	public TV(String s) {
		name = s;
	}


	@Override
	public void connectElectricCurrent() {
			turnOn();
	}
	public void turnOn() {
		System.out.println(name+"开始播放节目");
	}
	
	
}