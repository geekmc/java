package com.moban.java;

import java.io.File;

public abstract class AbstractTemplate {
	File[]allFile;
	File dir;
	public AbstractTemplate(File dir) {
		this.dir = dir;
	}
	public final void showFileName(){
		allFile=dir.listFiles();
		sort();
		printFiles();
	}
	public abstract void printFiles();
	public abstract void sort();
	
}
