package com.command.java;

public class ConcreteCommand implements Command {
	
	ComapanyArmy army;//���н����ߵ�����

	ConcreteCommand(ComapanyArmy army) {
		this.army = army;
	}

	@Override
	public void execute() {
		army.sneakAttack();
			
	}

}
