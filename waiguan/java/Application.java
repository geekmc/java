package com.waiguan.java;

public class Application {
		public static void main(String[] args) {
			ReadAndWirteFacade clientFacade;
			clientFacade=new ReadAndWirteFacade();
			String readFileName="index.html";
			String delConten="<[^>]*>";
			String savedFileName="save.txt";
			clientFacade.doOption(readFileName, delConten, savedFileName);
		}
}
