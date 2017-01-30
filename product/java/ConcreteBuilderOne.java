package com.product.java;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConcreteBuilderOne implements Builder{
	
	private PanelProduct panel;
	
	public ConcreteBuilderOne() {
			panel=new PanelProduct();
	}

	@Override
	public void buildButton() {
		panel.button=new JButton("��ť");
		
	}

	@Override
	public void buildLabel() {
		panel.label=new JLabel("��ǩ");
	}

	@Override
	public JPanel getPanel() {
		panel.add(panel.button);
		panel.add(panel.label);
		panel.add(panel.textField);
		return panel;
	}

	@Override
	public void buildTextFiwld() {
		panel.textField=new JTextField("�ı���");
	}

}
