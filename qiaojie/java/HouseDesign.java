package com.qiaojie.java;

public class HouseDesign implements BuildingDesign{
	double width,length;
	int floorNumber;
	

	public HouseDesign(double width, double length, int floorNumber) {
		this.width = width;
		this.length = length;
		this.floorNumber = floorNumber;
	}


	@Override
	public double computerArea() {
			
		return width*length*floorNumber;
	}

}
