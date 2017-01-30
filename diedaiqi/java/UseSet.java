package com.diedaiqi.java;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class UseSet {
	LinkedList<Student>list;
	Hashtable<String, Student>table;
	TreeSet<Student>tree;
	UseSet(){
		list=new LinkedList<Student>();
		tree=new TreeSet<Student>();
		table=new Hashtable<String,Student>();
	}
	public void addStudent(Student stu){
		list.add(stu);
		update();
		
	}
	public  void lookStudent(String n) {
			Student stu=table.get(n);
			String number=stu.getNumber();
			String name=stu.getName();
			double score=stu.getSorce();
			System.out.println("学号："+number+"姓名:"+name+"分数："+score);

	}
	public void printStudentByScore(){
		Iterator<Student>iterator=tree.iterator();
		while(iterator.hasNext()){
			Student stu=iterator.next();
			String number=stu.getNumber();
			String name=stu.getName();
			double sorce=stu.getSorce();
			System.out.println("学号："+number+"姓名："+name+"分数："+sorce);
		}
	}
	private void update() {
			tree.clear();
			Iterator<Student>iterator=list.iterator();
			while(iterator.hasNext()){
				Student stu=iterator.next();
				String number=stu.getNumber();
				table.put(number, stu);
				tree.add(stu);
			}
	}
	
	
}
