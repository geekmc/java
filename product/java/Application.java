package com.product.java;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Application {

	public static void main(String[] args) {
		Builder builder=new ConcreteBuilderOne();
		Director director=new Director(builder);
		JPanel panel=director.constructProduct();
		JFrame frameone=new JFrame();
		frameone.add(panel);
		frameone.setBounds(12, 12, 200, 120);
		frameone.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frameone.setVisible(true);
		
		builder=new ConcreteBuilderTwo();
		director=new Director(builder);
		panel=director.constructProduct();
		JFrame frame=new JFrame();
		frame.add(panel);
		frame.setBounds(12, 12, 200, 120);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
}
