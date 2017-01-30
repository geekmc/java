package com.diedaiqi.java;

public class Student implements Comparable{
	String number,name;
	double sorce=0;
	private int x=10;

	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String number, String name, double sorce) {
		super();
		this.number = number;
		this.name = name;
		this.sorce = sorce;
	}

	@Override
	public int compareTo(Object o) {
		Student st=(Student)o;
		if(Math.abs(this.sorce-st.sorce)<=1/10000)
		     return 1;
		return (int)(1000*(this.sorce-st.sorce));
	}

	public String getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public double getSorce() {
		return sorce;
	}
	

}
