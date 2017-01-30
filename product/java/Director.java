package com.product.java;

import javax.swing.JPanel;

public class Director {
	private Builder builder;

	public Director(Builder builder) {
		super();
		this.builder = builder;
	}
	public JPanel constructProduct(){
		builder.buildButton();
		builder.buildLabel();
		builder.buildTextFiwld();
		JPanel product=builder.getPanel();
		return product;
		
		
	}
	
}
