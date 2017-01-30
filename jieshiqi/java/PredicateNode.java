package com.jieshiqi.java;

public class PredicateNode implements Node {
	Node verbNode,objectNode;

	@Override
	public void parse(Context context) {
		verbNode=new VerbNode();
		objectNode=new ObjectPronounOrNouNode();
		verbNode.parse(context);
		objectNode.parse(context);
	}

	@Override
	public void execute() {
		verbNode.execute();
		objectNode.execute();
	}

}
