package com.command.java;

public class Application {
	
	public static void main(String[] args) {
		ComapanyArmy tz=new ComapanyArmy();
		Command c=new ConcreteCommand(tz);
		ArmySuperior ld=new ArmySuperior();
		ld.setCommand(c);
		ld.startExecuteCommand();
	}
}
