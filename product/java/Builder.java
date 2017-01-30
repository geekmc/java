package com.product.java;

import javax.swing.JPanel;

public interface Builder {
	public abstract void buildButton();
	public abstract void buildLabel();
	public abstract JPanel getPanel();
	public abstract void buildTextFiwld();
}
