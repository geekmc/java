package com.moban.java;

import java.io.File;

public class Application {
		public static void main(String[] args) {
				File dir=new File("·��");
				AbstractTemplate template=new ConcreteTemplatel(dir);
				System.out.println(dir.getPath()+"Ŀ¼�µ��ļ���");
				template.showFileName();
				template=new ConcreteTemplate2(dir);
				System.out.println(dir.getPath()+"Ŀ¼�µ��ļ���");
				template.showFileName();
			
			
		}
}
