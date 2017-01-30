package com.celuemoshi.java;

public class StrategyTwo implements ComputableStrategy {

	@Override
	public double computeSocre(double[] a) {
		double score=0,multi=1;
		int n=a.length;
		for (int i = 0; i < a.length; i++) {
			multi=multi*a[i];
		}
		score=Math.pow(multi, 1.0/n);
		
		return score;
	}

}
