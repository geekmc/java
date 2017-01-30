package com.waiguan.java;

public class ReadAndWirteFacade {
	private ReadFile readFile;
	private WriteFile writeFile;
	private AnalyzeInformation analyzeInformation;
	public ReadAndWirteFacade() {
		readFile=new ReadFile();
		analyzeInformation=new AnalyzeInformation();
		writeFile=new WriteFile();
	}
	public void doOption(String readFileName,String delContent,String savedFileName){
		String content=readFile.readFileContent(readFileName);
		System.out.println("��ȡ�ļ�"+readFileName+"������");
		System.out.println(content);
		String savedContent=analyzeInformation.getSavedContent(content, delContent);
		writeFile.writeToFile(savedFileName, savedContent);
		System.out.println("���浽�ļ�"+savedContent+"�е�����");
		System.out.println(savedContent);
		
	}
	
}
