package com.xiangyuan.java;

public class Car {
	Flyweight flyweight;
	String name,color;
	int power;
	public Car(Flyweight flyweight, String name, String color, int power) {
		super();
		this.flyweight = flyweight;
		this.name = name;
		this.color = color;
		this.power = power;
	}
	public void print(){
		System.out.println("���ƣ�"+name);
		System.out.println("��ɫ��"+color);
		System.out.println("���ʣ�"+power);
		System.out.println("��ȣ�"+flyweight.getWidth());
		System.out.println("�߶�:"+flyweight.getHeight());
		System.out.println("����:"+flyweight.getLength());
	}
	
}
