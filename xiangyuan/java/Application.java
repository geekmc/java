package com.xiangyuan.java;

public class Application {
	
	public static void main(String[] args) {

		FlyweightFactory factory=FlyweightFactory.getFactory();
		
		double width=1.82,height=1.47,length=5.12;
		
		String key=""+width+"#"+height+"#"+length;
		
		Flyweight flyweight=factory.getFlyweight(key);
		
		Car audiA6One=new Car(flyweight, "奥迪", "黑色", 128);
		
		Car audiA6Two=new Car(flyweight, "奥迪", "灰色", 160);
		
		audiA6One.print();
		audiA6Two.print();
		
		width=1.77;
		height=1.45;
		length=4.63;
		
		key=""+width+"#"+height+"#"+length;
		
		flyweight=factory.getFlyweight(key);
		
		Car audiA4One=new Car(flyweight, "A4", "蓝色", 126);
		Car audiA4Two=new Car(flyweight, "A4", "红色", 138);
		
		flyweight.printMess("名称：奥迪A6：颜色：蓝色 功率：126");
		flyweight.printMess("名称：A4 颜色：红色 功率：138");
		
		
	}
}
