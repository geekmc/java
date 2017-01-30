package com.diedaiqi.java;

public class Application {
public static void main(String[] args) {
	UseSet useSet=new UseSet();
	useSet.addStudent(new Student("001", "cc", 76.9));
	String n="001";
	System.out.println("查找学号为："+n+"的学生：");
	useSet.lookStudent(n);
	System.out.println("将学生按成绩排列:");
	useSet.printStudentByScore();
}
}
