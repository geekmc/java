package com.factor.java;

public class RedPencore extends PenCore {
	RedPencore(){
		color="��ɫ";
	}
	

	@Override
	public void wirteWord(String s) {
			System.out.println("д��"+color+"����:"+s);
	}
	
	
}
