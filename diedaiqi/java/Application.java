package com.diedaiqi.java;

public class Application {
public static void main(String[] args) {
	UseSet useSet=new UseSet();
	useSet.addStudent(new Student("001", "cc", 76.9));
	String n="001";
	System.out.println("����ѧ��Ϊ��"+n+"��ѧ����");
	useSet.lookStudent(n);
	System.out.println("��ѧ�����ɼ�����:");
	useSet.printStudentByScore();
}
}
