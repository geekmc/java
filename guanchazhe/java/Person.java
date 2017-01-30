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
			System.out.println("Ԥ�����ڣ�"+forecastTime+",");
			System.out.println("����״��:"+forecastMess+",");
			System.out.println("����¶ȣ�"+maxTemperature+",");
			System.out.println("����¶�:"+minTemperature+",");
		}else if(subject instanceof TravelAgency){
			TravelAgency ta=(TravelAgency)subject;
			tourStartTime = ta.getTourStartTime();
		    tourMess=ta.getTourMess();
			System.out.println("���ο�ʼ���ڣ�"+tourStartTime+",");
			System.out.println("������Ϣ��"+tourMess+",");
			
		}
	}

}
