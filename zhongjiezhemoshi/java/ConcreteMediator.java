package com.zhongjiezhemoshi.java;

public class ConcreteMediator {
	ColleagueA colleageA;
	ColleageB colleageB;
	ColleageC colleageC;
	public void registerColleagueA(ColleagueA colleagueA)
	{
		this.colleageA=colleagueA;
	}
	public void registerColleagueB(ColleageB colleagueB)
	{
		this.colleageB=colleagueB;
	}
	public void registerColleagueC(ColleageC colleagueC)
	{
		this.colleageC=colleagueC;
	}
	
	public void deliverMess(Colleage colleage,String []mess){
		if(colleage==colleageA){
			if(mess.length>=2){
				colleageB.receiverMess(colleage.getName()+mess[0]);
				colleageC.receiverMess(colleage.getName()+mess[1]);
			}else if(colleage==colleageB){
				if(mess.length>=2){
					colleageA.receiverMess(colleage.getName()+mess[0]);
					colleageC.receiverMess(colleage.getName()+mess[1]);
				}
				
			}else if(colleage==colleageC){
				if(mess.length>=2){
					colleageA.receiverMess(colleage.getName()+mess[0]);
					colleageB.receiverMess(colleage.getName()+mess[1]);
				}
			}
		}
	}
	
	
}
