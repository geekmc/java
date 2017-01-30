package com.xiangyuan.java;

public class Application {
	
	public static void main(String[] args) {

		FlyweightFactory factory=FlyweightFactory.getFactory();
		
		double width=1.82,height=1.47,length=5.12;
		
		String key=""+width+"#"+height+"#"+length;
		
		Flyweight flyweight=factory.getFlyweight(key);
		
		Car audiA6One=new Car(flyweight, "�µ�", "��ɫ", 128);
		
		Car audiA6Two=new Car(flyweight, "�µ�", "��ɫ", 160);
		
		audiA6One.print();
		audiA6Two.print();
		
		width=1.77;
		height=1.45;
		length=4.63;
		
		key=""+width+"#"+height+"#"+length;
		
		flyweight=factory.getFlyweight(key);
		
		Car audiA4One=new Car(flyweight, "A4", "��ɫ", 126);
		Car audiA4Two=new Car(flyweight, "A4", "��ɫ", 138);
		
		flyweight.printMess("���ƣ��µ�A6����ɫ����ɫ ���ʣ�126");
		flyweight.printMess("���ƣ�A4 ��ɫ����ɫ ���ʣ�138");
		
		
	}
}
