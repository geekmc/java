package com.zerenlian.java;

import java.math.BigInteger;

public class UseBigInteger implements Handler{
	private Handler handler;
	private BigInteger result=new BigInteger("1");
	@Override
	public void computerMultiply(String number) {
			try {
				BigInteger n=new BigInteger(number);
				BigInteger ONE=new BigInteger("1");
				BigInteger i=ONE;
				while(i.compareTo(n)<=0){
					result=result.multiply(i);
					i=i.add(ONE);
				}
				System.out.println(number+"µÄ½×³Ë"+result);
			} catch (Exception e) {
				// TODO: handle exception
			}
	}
	@Override
	public void setNextHandler(Handler handler) {
			this.handler=handler;
	}
}
