package com.xiangyuan.java;

import java.util.HashMap;

public class FlyweightFactory {
			private HashMap<String, Flyweight> hashMap;
			static FlyweightFactory factory=new FlyweightFactory();
			private FlyweightFactory(){
				hashMap=new HashMap<String,Flyweight>();
			}
			public static FlyweightFactory getFactory(){
				return factory;
			}
			public synchronized Flyweight getFlyweight(String key){
				if(hashMap.containsKey(key))
					return hashMap.get(key);
				else{
						double width=0,height=0,length=0;
						String []str=key.split("#");
					    width=Double.parseDouble(str[0]);
						height=Double.parseDouble(str[1]);
						length=Double.parseDouble(str[2]);
						Flyweight ft= new ConcreFlyweight(width, height, length);
						hashMap.put(key, ft);
						return ft;
					}
}
class ConcreFlyweight implements Flyweight{
	
	private double width;
	private double height;
	private double length;
	

	private ConcreFlyweight(double width, double height, double length) {
		this.width = width;
		this.height = height;
		this.length = length;
	}

	@Override
	public double getHeight() {

		return height;
	}

	@Override
	public double getWidth() {
		
		return width;
	}

	@Override
	public double getLength() {

		return length;
	}

	@Override
	public void printMess(String mess) {
			System.out.println(mess);
			System.out.println("宽度："+width);
			System.out.println("高度："+height);
			System.out.println("长度："+length);
	}
}
}