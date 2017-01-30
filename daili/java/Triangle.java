package com.daili.java;

public class Triangle implements Geometry{
	 double sideA,sideB,sideC,area;
	 

	public Triangle(double sideA, double sideB, double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}


	@Override
	public double getArea() {
		double p=(sideA+sideB+sideC)/2.0;
		area=Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
		return area;
	}

}
