package com.factor.java;

public class BluePenCore extends PenCore {
	public BluePenCore() {
		color="��ɫ";
	}

	@Override
	public void wirteWord(String s) {
		System.out.println("д��"+color+"����:"+s);
	}

}
