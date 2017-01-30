package com.guanchazhe.java;


import java.util.ArrayList;

public class TravelAgency implements Subject {
	
	String tourStarTime;
	String tourMess;
	ArrayList<Observer> personList;
	
	

	public TravelAgency() {
		personList=new ArrayList<Observer>();
	}

	@Override
	public void addObserver(Observer o) {
			if(o==null){
				return;
			}
			if(!(personList.contains(o)))
				personList.add(o);
	}

	@Override
	public void deletObserver(Observer o) {
		if(personList.contains(o))
			personList.remove(o);
		
	}

	@Override
	public void notifyObserver() {
			for (int i = 0; i < personList.size(); i++) {
				Observer ob=personList.get(i);
				ob.update(this);
			}
	}
	
	public void giveMess(String time,String mess){
		tourMess=mess;
		tourStarTime=time;
		notifyObserver();
	}

	public String getTourStartTime(){
		return tourStarTime;
	}
	public String getTourMess(){
		return tourMess;
	}
}
