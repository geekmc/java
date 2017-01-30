package com.moban.java;

import java.io.File;

public class ConcreteTemplate2  extends AbstractTemplate{

	public ConcreteTemplate2(File dir) {
		super(dir);
	}

	@Override
	public void printFiles() {
			for (int i = 0; i < allFile.length; i++) {
				long fileSize=allFile[i].length();
				String name=allFile[i].getName();
				int k=i+1;
				System.out.println(k+" "+name+"("+fileSize+"×Ö½Ú");
			}
	}

	@Override
	public void sort() {
		for (int i = 0; i < allFile.length; i++) {
			for (int j = i+1; j < allFile.length; j++) {
				if(allFile[j].length()<allFile[i].length()){
					File file=allFile[j];
					allFile[j]=allFile[i];
					allFile[i]=file;
				}
			}
		}
	}

}
