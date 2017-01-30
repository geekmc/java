package com.zhongjiezhemoshi.java;


public class ColleageB implements Colleage{
	
		ConcreteMediator mediator;
		String name;
		

	public ColleageB(ConcreteMediator mediator) {
		 this.mediator = mediator;
		 mediator.registerColleagueB(this);
	}


	public void receiverMess(String mess) {
			System.out.println(name+"收到信息");
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
		return name;
	}

}
