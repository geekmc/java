package com.zuhe.java;

import java.util.Iterator;
import java.util.LinkedList;

public class MilitaryOfficer implements MilitaryPerson {
	LinkedList<MilitaryPerson> list;
	String name;
	double salary;
	

	public MilitaryOfficer( String name,
			double salary) {
		list=new LinkedList<MilitaryPerson>();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public void add(MilitaryPerson person) {
		list.add(person);
		
	}

	@Override
	public void remove(MilitaryPerson person) {
			list.remove(person);
	}

	@Override
	public MilitaryPerson getChild(int index) {
		return list.get(index);
	}

	@Override
	public Iterator<MilitaryPerson> getAllChildren() {
		return list.iterator();
	}

	@Override
	public boolean isleaf() {
		return false;
	}

	@Override
	public double getSalary() {
		return salary;
	}

	@Override
	public void setSalary(double salary) {
		this.salary=salary;
	}

	
}
