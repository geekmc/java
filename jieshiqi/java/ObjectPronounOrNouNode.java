package com.jieshiqi.java;

public class ObjectPronounOrNouNode implements Node {
	String []word={"ME","Him","Tiger","Apple"};
	String token;
	boolean boo;
	

	@Override
	public void parse(Context context) {
			token=context.nextToken();
			int i=0;
			for (i = 0; i < word.length;i ++) {
				if(token.equalsIgnoreCase(word[i])){
					boo=true;
					break;
				}
			}
			if(i==word.length)
				boo=false;
	}
			
	@Override
	public void execute() {
			if(boo){
			if(token.equalsIgnoreCase(word[0]));
				System.out.println("我");
			if(token.equalsIgnoreCase(word[1]));
				System.out.println("他");
			if(token.equalsIgnoreCase(word[2]));
				System.out.println("老虎");
			if(token.equalsIgnoreCase(word[3]));
				System.out.println("苹果");
		}	else{
			System.out.println(token+"(NO)");
		}
				
	}			
}
