package com.zerenlian.java;

public class UseLong implements Handler {
	private Handler handler;
	private long result=1;
	
	@Override
	public void computerMultiply(String number) {
			try {
				long n=Long.parseLong(number);
				long i=1;
				while(i<=n){
					result=result*i;
					if(result<=0){
						System.out.println("超出能力范围,,,");
						handler.computerMultiply(number);
						return;
					}
					i++;
				}
				System.out.println(number+"的阶乘"+result);
			} catch (Exception e) {
				// TODO: handle exception
			}
	}
	@Override
	public void setNextHandler(Handler handler) {
			this.handler=handler;
	}
}
