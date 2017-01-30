package com.adapter.java;

public class Application {
			public static void main(String[] args) {
				ThreeElectricOutlet outlet;
				Wash w=new Wash();
				outlet=w;
				System.out.println("ʹ�����������");
				outlet.connectElectricCurrent();
				TV t=new TV();
				TreeElectricAdapter adapter=new TreeElectricAdapter(t);
				outlet=adapter;
				System.out.println("ʹ���������");
				outlet.connectElectricCurrent();
			}
}
class Wash implements ThreeElectricOutlet{
	String name;
	Wash(){
		name="�ƺ�ϴ�»�";
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
		name="��������";
		
	}
	public TV(String s) {
		name = s;
	}


	@Override
	public void connectElectricCurrent() {
			turnOn();
	}
	public void turnOn() {
		System.out.println(name+"��ʼ���Ž�Ŀ");
	}
	
	
}