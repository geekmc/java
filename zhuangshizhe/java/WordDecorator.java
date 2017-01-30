package com.zhuangshizhe.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class WordDecorator extends Decorator{
	File decoratorFile;

	public WordDecorator(ReadWord reader,File decoratorFile) {
		super(reader);
		this.decoratorFile = decoratorFile;
		
	}
	public ArrayList<String> readWord(File file){
		ArrayList<String> wordList=reader.readWord(file);
		try {
			FileReader inOne=new FileReader(decoratorFile);
			BufferedReader inTwo=new BufferedReader(inOne);
			String s=null;
			int m=0;
			while((s=inTwo.readLine())!=null){
				String word=wordList.get(m);
				word=word.concat("|"+s);
				wordList.set(m, word);
				m++;
				if(m>wordList.size())break;
			}
			inOne.close();
			inTwo.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return wordList;
		
		
	}
	
	
}
