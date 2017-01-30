package com.zhuangshizhe.java;

public abstract class Decorator extends ReadWord {
	protected ReadWord reader;

	public Decorator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Decorator(ReadWord reader) {
		super();
		this.reader = reader;
	}
}
