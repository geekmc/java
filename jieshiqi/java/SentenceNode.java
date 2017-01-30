package com.jieshiqi.java;

public class SentenceNode implements Node{
	
	Node subjectNode,predicateNode;
	

	@Override
	public void parse(Context context) {
		subjectNode=new SubjectNode();
		predicateNode=new PredicateNode();
		subjectNode.parse(context);
		predicateNode.parse(context);
	}

	@Override
	public void execute() {
		subjectNode.execute();
		predicateNode.execute();
	}

}
