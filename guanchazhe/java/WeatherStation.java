package com.guanchazhe.java;

import java.util.ArrayList;

public class WeatherStation implements Subject {
	String foreastTime ,forecastMess;
	int maxTemperature,minTemperature;
	ArrayList<Observer>personList;
	WeatherStation(){
		personList=new ArrayList<Observer>();
	}

	@Override
	public void addObserver(Observer o) {
		if(o==null){
			return;
		}
		if(!(personList.contains(o))){
			personList.add(o);
		}
		
	}

	@Override
	public void deletObserver(Observer o) {
		if(personList.contains(o))
			personList.remove(o);
		
	}

	public void doForecast(String t,String mess,int max,int min){
		
		forecastMess=mess;
		foreastTime=t;
		maxTemperature=max;
		minTemperature=min;
		notifyObserver();
		
	}

	@Override
	public void notifyObserver() {
		for (int i = 0; i < personList.size(); i++) {
			Observer ob=personList.get(i);
			ob.update(this);
		}
	}

	public String getForeastTime() {
		return foreastTime;
	}

	public String getForecastMess() {
		return forecastMess;
	}

	public int getMaxTemperature() {
		return maxTemperature;
	}

	public int getMinTemperature() {
		return minTemperature;
	}
}
