package com.guanchazhe.java;

public class Application {
public static void main(String[] args) {
	WeatherStation wt=new WeatherStation();//��������
	TravelAgency ta=new TravelAgency();
	Person ma=new Person(wt, ta);
	wt.doForecast("10��", "����", 28, 15);
	ta.giveMess("10��", "����һ����");
	wt.doForecast("11��", "��ѩ", 10, 5);
	ta.giveMess("11��", "���һ����");
}
}
