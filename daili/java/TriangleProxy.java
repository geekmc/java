package com.daili.java;

public class TriangleProxy implements Geometry{
	double sideA,sideB,sideC;
	Triangle Triangle;
	public void setABC(double a,double b,double c){
		sideA=a;
		sideB=b;
		sideC=c;
	}
	@Override
	public double getArea() {
		if(sideA+sideB>sideC&&sideA+sideC>sideB&&sideB+sideC>sideA){
			Triangle=new Triangle(sideA, sideB, sideC);
			double area=Triangle.getArea();
			return area;
		}else{
			return -1;
		}
	}

}
