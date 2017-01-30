package com.zhongjiezhemoshi.java;

public class Application {

	
	public static void main(String[] args) {
		
		ConcreteMediator mediator=new ConcreteMediator();
		
		ColleagueA colleagA=new ColleagueA(mediator);
		ColleageB colleageB=new ColleageB(mediator);
		ColleageC colleageC=new ColleageC(mediator);
		colleagA.setName("aA");
	
		colleageB.setName("aB");
		colleageC.setName("ac");
		String [] messA={"aa100£¬aa200"};
		colleagA.giveMess(messA);
	
		String [] messB={"aa10","aa20"};
		colleageB.giveMess(messB);
		String [] messC={"aa1","aa2"};
		colleageC.giveMess(messC);
	}
	
}
