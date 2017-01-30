package com.zhongjiezhemoshi.java;


public class ColleageC implements Colleage{
	ConcreteMediator mediator;
	String name;
	

	public ColleageC(ConcreteMediator mediator) {
		this.mediator = mediator;
		mediator.registerColleagueC(this);
	}

	public void receiverMess(String mess) {
			System.out.println(name+"�յ�����Ϣ");
			System.out.println("\t"+mess);
	}

	@Override
	public void giveMess(String[] mess) {
		mediator.deliverMess(this, mess);
	}

	@Override
	public void setName(String name) {
		this.name=name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
