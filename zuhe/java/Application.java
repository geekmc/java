package com.zuhe.java;

public class Application {
	public static void main(String[] args) {
		MilitaryPerson ����=new MilitaryOfficer( "����", 5000);
		MilitaryPerson �ų�1=new MilitaryOfficer("һ�ų�", 4000);
		MilitaryPerson �ų�2=new MilitaryOfficer("���ų�", 4000);
		
		MilitaryPerson �೤11=new MilitaryOfficer("һ�೤", 2000);
		MilitaryPerson �೤12=new MilitaryOfficer("���೤", 2000);
		MilitaryPerson �೤13=new MilitaryOfficer("���೤", 2000);
		
		MilitaryPerson �೤21=new MilitaryOfficer("һ�೤", 2000);
		MilitaryPerson �೤22=new MilitaryOfficer("���೤", 2000);
		MilitaryPerson �೤23=new MilitaryOfficer("���೤", 2000);
		
		MilitaryPerson �೤31=new MilitaryOfficer("һ�೤", 2000);
		MilitaryPerson �೤32=new MilitaryOfficer("���೤", 2000);
		MilitaryPerson �೤33=new MilitaryOfficer("���೤", 2000);
		
		MilitaryPerson [] ʿ��=new MilitarySoldier[600];
		for (int i = 0; i < ʿ��.length; i++) {
			ʿ��[i]=new MilitarySoldier(1000, "С��");
			
		}
		����.add(�ų�1);
		����.add(�ų�2);
		�ų�1.add(�೤11);
		�ų�1.add(�೤12);
		�ų�1.add(�೤13);
		
		�ų�2.add(�೤21);
		�ų�2.add(�೤22);
		�ų�2.add(�೤23);
		
		for (int i = 0; i <=9; i++) {
			�೤11.add(ʿ��[i]);
			�೤12.add(ʿ��[i+10]);
			�೤13.add(ʿ��[i+20]);
			
			�೤21.add(ʿ��[i+30]);
			�೤22.add(ʿ��[i+40]);
			�೤23.add(ʿ��[i+50]);
			
			�೤31.add(ʿ��[i+60]);
			�೤32.add(ʿ��[i+70]);
			�೤33.add(ʿ��[i+80]);
		}
		System.out.println("һ��ľ��ã�"+ComputerSalary.computerSalary(�೤11));
		System.out.println("һ�ŵľ���:"+ComputerSalary.computerSalary(�ų�1));
		System.out.println("ȫ���ľ���:"+ComputerSalary.computerSalary(����));
		
		
		
		
	}
}
