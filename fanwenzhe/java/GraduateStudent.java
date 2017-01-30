package com.fanwenzhe.java;

public class GraduateStudent {
	double math,english,physics;
	String name;
	public GraduateStudent(double math, double english, double physics,
			String name) {
		this.math = math;
		this.english = english;
		this.physics = physics;
		this.name = name;
	}
	public double getMath() {
		return math;
	}
	public double getEnglish() {
		return english;
	}
	public double getPhysics() {
		return physics;
	}
	public String getName() {
		return name;
	}
	public void accpt(Visitor v){
		v.visit(this);
	}
	

}
