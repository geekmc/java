package com.qiaojie.java;

public class BuildingCost extends ArchitectureCore{
	public BuildingCost(BuildingDesign design,double unitPrice) {
			this.design=design;
			this.unitPrice=unitPrice;
	}
	
	

	@Override
	public double giveCost() {
		double area=design.computerArea();
		return area*unitPrice;
	}

}
