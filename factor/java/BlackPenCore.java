package com.factor.java;

public class BlackPenCore  extends PenCore{
	
	public BlackPenCore() {
		color="��ɫ";
	}

	@Override
	public void wirteWord(String s) {
		System.out.println("д��"+color+"���֣�"+s);
	}

}
