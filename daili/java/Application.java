package com.daili.java;

import java.util.Scanner;

public class Application {
		public static void main(String[] args) {
			Scanner reader=new Scanner(System.in);
			System.out.println("请输入按个数");
			double a=-1,b=-1,c=-1;
			a=reader.nextDouble();
			b=reader.nextDouble();
			c=reader.nextDouble();
			TriangleProxy proxy=new TriangleProxy();
			proxy.setABC(a, b, c);
			double area=proxy.getArea();
			System.out.println("面积是："+area);
		}
}
