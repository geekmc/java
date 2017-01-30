package com.guanchazhe.java;

public class Person implements Observer{
	Subject subjectOne,subjectTwo;
	String forecastTime,forecastMess;
	String tourStartTime,tourMess;
	int maxTemperature,minTemperature;

	Person(Subject subjectOne, Subject subjectTwo) {
		this.subjectOne = subjectOne;
		this.subjectTwo = subjectTwo;
		subjectOne.addObserver(this);
		subjectTwo.addObserver(this);
	}
	public void update(Subject subject){
		if(subject instanceof WeatherStation){
			WeatherStation ws=(WeatherStation)subject;
			forecastTime=ws.getForeastTime();
			forecastMess=ws.getForecastMess();
			maxTemperature=ws.getMaxTemperature();
			minTemperature=ws.getMinTemperature();
			System.out.println("预报日期："+forecastTime+",");
			System.out.println("天气状况:"+forecastMess+",");
			System.out.println("最高温度："+maxTemperature+",");
			System.out.println("最低温度:"+minTemperature+",");
		}else if(subject instanceof TravelAgency){
			TravelAgency ta=(TravelAgency)subject;
			tourStartTime = ta.getTourStartTime();
		    tourMess=ta.getTourMess();
			System.out.println("旅游开始日期："+tourStartTime+",");
			System.out.println("旅游信息："+tourMess+",");
			
		}
	}

}
