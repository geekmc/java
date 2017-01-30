package com.zuhe.java;

import java.util.Iterator;

public class ComputerSalary {
	public static double computerSalary(MilitaryPerson person){
		double sum=0;
		if(person.isleaf()==true){
			sum=sum+person.getSalary();
		}
		if(person.isleaf()==false){
			sum=sum+person.getSalary();
			Iterator<MilitaryPerson>iterator=person.getAllChildren();
			while(iterator.hasNext()){
				MilitaryPerson p=iterator.next();
				sum=sum+computerSalary(p);
			}
					
		}
		
		
		return sum;
		
		
		
		
	}
}
