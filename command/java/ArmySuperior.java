package com.command.java;

public class ArmySuperior {
	Command command;//������ž������������
	public void setCommand(Command command){
		this.command=command;
	}
	public void startExecuteCommand(){
		command.execute();
	}

}
