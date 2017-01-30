package com.beiwanglu.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;


public class Application {
	public static void main(String[] args) {
			Scanner reader=new Scanner(System.in);
			ReaderPhrase readerPhrase=new ReaderPhrase(new File(""));
			File favorPhrase=new File("");
			RandomAccessFile out =null;
			try {
				out= new RandomAccessFile(favorPhrase, "rw");
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println("Y or N");
			String answer=reader.nextLine();
			if(answer.startsWith("y")||answer.startsWith("Y")){
				Caretaker caretaker=new Caretaker();
				Memento memento=caretaker.getMemento();
				if(memento!=null)
					readerPhrase.restoreFromMemento(memento);
			}
				String phrase=null;
				while((phrase=readerPhrase.readLine())!=null){
					System.out.println(phrase);
					System.out.println();
					answer=reader.nextLine();
					if(answer.startsWith("y")||answer.startsWith("Y")){
						try {
							out.seek(favorPhrase.length());
							byte []b=phrase.getBytes();
							out.write(b);
							out.writeChar('\n');
						} catch (IOException e) {
							e.printStackTrace();
						}
						System.out.println("Y or Y");
						answer=reader.nextLine();
						if(answer.startsWith("y")||answer.startsWith("Y"))
							continue;
						else{
							readerPhrase.closeRead();
							Caretaker caretaker=new Caretaker();
							caretaker.saveMemento(readerPhrase.createMemento());
							
							try {
									out.close();
									
							} catch (IOException e) {
								e.printStackTrace();
							}
							System.exit(0);;
						}
					}
					System.out.println("OK");
				}
	}
}
