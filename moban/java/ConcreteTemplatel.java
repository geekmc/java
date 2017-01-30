package com.moban.java;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConcreteTemplatel extends AbstractTemplate {
	

	public ConcreteTemplatel(File dir) {
		super(dir);
	}

	@Override
	public void printFiles() {
		for (int i = 0; i < allFile.length; i++) {
			long time=allFile[i].lastModified();
			Date date=new Date();
			SimpleDateFormat matter=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String name=allFile[i].getName();
			int k=i+1;
			System.out.println(k+" "+name+"("+name+")");
		}
		
	}

	@Override
	public void sort() {
		for (int i = 0; i < allFile.length; i++) {
			for (int j = i+1; j < allFile.length; j++) {
				if(allFile[j].lastModified()<allFile[i].lastModified()){
					File file=allFile[j];
					allFile[j]=allFile[i];
					allFile[i]=file;
				}
			}
		}
	
	}
}
