package com.guanchazhe.java;

public class Application {
public static void main(String[] args) {
	WeatherStation wt=new WeatherStation();//具体主题
	TravelAgency ta=new TravelAgency();
	Person ma=new Person(wt, ta);
	wt.doForecast("10日", "多云", 28, 15);
	ta.giveMess("10日", "北京一日游");
	wt.doForecast("11日", "大雪", 10, 5);
	ta.giveMess("11日", "香港一日游");
}
}
