package com.factor.java;

public class BluePenCore extends PenCore {
	public BluePenCore() {
		color="À¶É«";
	}

	@Override
	public void wirteWord(String s) {
		System.out.println("Ð´³ö"+color+"µÄ×Ö:"+s);
	}

}
