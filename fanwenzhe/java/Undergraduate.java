package com.fanwenzhe.java;

public class Undergraduate {
	double math,english;
	String name;
	public Undergraduate(double math, double english, String name) {
		this.math = math;
		this.english = english;
		this.name = name;
	}
	public double getMath() {
		return math;
	}
	public double getEnglish() {
		return english;
	}
	public String getName() {
		return name;
	}
	public void accpet(Visitor v){
		v.visit(this);
	}

}
