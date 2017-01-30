package com.beiwanglu.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ReaderPhrase {
	long readPosition;
	File file;
	RandomAccessFile in;
	String phrase=null;
	public ReaderPhrase(File file) {
		this.file = file;
		try {
			in=new RandomAccessFile(file, "r");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public Memento createMemento(){
		Memento mem=new Memento();
		mem.setPositionState(readPosition);
		return mem;
	}
	public void restoreFromMemento(Memento mem){
		readPosition=mem.getPositionState();
	}
	public String readLine(){
		try {
			in.seek(readPosition);
			if(phrase!=null){
				byte b[]=phrase.getBytes("iso-8859-1");
				phrase=new String(b);
			}
			readPosition=in.getFilePointer();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return phrase;
	}
	public void closeRead(){
		try {
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
