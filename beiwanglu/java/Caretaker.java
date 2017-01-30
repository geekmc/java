package com.beiwanglu.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Caretaker {
	File file;
	private Memento memento=null;
	public Caretaker() {
			file=new File("");
	}
	public Memento getMemento(){
		if(file.exists()){
			try {
				FileInputStream in=new FileInputStream("");
				ObjectInputStream inObject = null;
				try {
					inObject = new ObjectInputStream(in);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					try {
						memento=(Memento) inObject.readObject();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
		}
		return memento;
	}
	public void saveMemento(Memento memento) {
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ObjectOutputStream outObject=new ObjectOutputStream(out);
			outObject.writeObject(memento);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
