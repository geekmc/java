package com.celuemoshi.java;

public class Application {
		public static void main(String[] args) {
			GymnasticsGame game=new GymnasticsGame();
			game.setStrategy(new StrategyOne());
			Person zhang=new Person();
			zhang.setName("张三");
			double []a={9.12,9.25,8.87,9.89};
			Person li=new Person();
			li.setName("李四");
			double []b={9.12,9.25,8.87,9.89};
			zhang.setScore(game.getPersonScore(a));
			li.setScore(game.getPersonScore(b));
			System.out.println("使用算术平均值方案：");
			System.out.printf("最后得分：",zhang.getName(),zhang.getScore());
			
			
			
			
		}
}
class Person{
	
	String name;
	double score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	
}