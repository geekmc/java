package com.zhongjiezhemoshi.java;

public class ColleagueA implements Colleage{
	
	ConcreteMediator mediator;//�н���
	String name;

	public ColleagueA(ConcreteMediator mediator) {
		this.mediator = mediator;
		mediator.registerColleagueA(this);
	}

	@Override
	public void giveMess(String[] mess) {
		mediator.deliverMess(this, mess);
	}

	@Override
	public void receiverMess(String mess) {
			System.out.println(name+"�յ���Ϣ");
			System.out.println("\t"+mess);
	}

	@Override
	public void setName(String name) {
		this.name=name;
	}

	@Override
	public String getName() {
		return name;
	}

}
