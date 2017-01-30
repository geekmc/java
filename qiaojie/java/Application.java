package com.qiaojie.java;

public class Application {
	public static void main(String[] args) {
		double width=63,height=30;
		int floorNumber=8;
		double unitPrice=6867.38;
		BuildingDesign design=new HouseDesign(width, height, floorNumber);
		System.out.println("宽"+width+"米，高"+height+"米，层数为："+floorNumber);
		ArchitectureCore cost=new BuildingCost(design, unitPrice);
		double price=cost.giveCost();
		System.out.printf("每平方米造价为："+unitPrice+"元的商业楼的建设成本：%.2f\n",price);
		width=50;
		height=28;
		floorNumber=6;
		unitPrice=2687.88;
		design=new HouseDesign(width, height, floorNumber);
		System.out.printf("宽"+width+"米，高"+height+"米，层数为"+floorNumber);
		
		cost=new BuildingCost(design, unitPrice);
		price=cost.giveCost();
		System.out.printf("每平方米造价"+unitPrice+"元的住宅楼的建设成本%.2f\n",price);
		
	}

}
