package com.command.java;

public class ConcreteCommand implements Command {
	
	ComapanyArmy army;//含有接收者的引用

	ConcreteCommand(ComapanyArmy army) {
		this.army = army;
	}

	@Override
	public void execute() {
		army.sneakAttack();
			
	}

}
