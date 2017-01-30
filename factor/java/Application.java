package com.factor.java;

public class Application {
		public static void main(String[] args) {
			PenCore penCore;
			BallPen ballPen=new BlueBalPen();
			penCore=ballPen.getPenCore();
			penCore.wirteWord("hello  world");
			ballPen=new RedBallPen();
			penCore=ballPen.getPenCore();
			penCore.wirteWord("HOW  ARE  YOU");
			ballPen=new BlackBallPen();
			penCore=ballPen.getPenCore();
			penCore.wirteWord("OK");
		}
}
