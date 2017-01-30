package com.qiaojie.java;

public class Application {
	public static void main(String[] args) {
		double width=63,height=30;
		int floorNumber=8;
		double unitPrice=6867.38;
		BuildingDesign design=new HouseDesign(width, height, floorNumber);
		System.out.println("��"+width+"�ף���"+height+"�ף�����Ϊ��"+floorNumber);
		ArchitectureCore cost=new BuildingCost(design, unitPrice);
		double price=cost.giveCost();
		System.out.printf("ÿƽ�������Ϊ��"+unitPrice+"Ԫ����ҵ¥�Ľ���ɱ���%.2f\n",price);
		width=50;
		height=28;
		floorNumber=6;
		unitPrice=2687.88;
		design=new HouseDesign(width, height, floorNumber);
		System.out.printf("��"+width+"�ף���"+height+"�ף�����Ϊ"+floorNumber);
		
		cost=new BuildingCost(design, unitPrice);
		price=cost.giveCost();
		System.out.printf("ÿƽ�������"+unitPrice+"Ԫ��סլ¥�Ľ���ɱ�%.2f\n",price);
		
	}

}
