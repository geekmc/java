package com.zerenlian.java;

public class UseInt implements Handler{
	private Handler handler;
	private int result=1;
	@Override
	public void computerMultiply(String number) {
			try {
				int n=Integer.parseInt(number);
				int i=1;
				while(i<=n){
					result=result*i;
					if(result<=0){
						System.out.println("超出我的能力范围");
						handler.computerMultiply(number);
						return;
					}
					i++;
				}
				System.out.println(number+"的阶乘:"+result);
			} catch (Exception e) {
				// TODO: handle exception
			}
	}
	@Override
	public void setNextHandler(Handler handler) {
			this.handler=handler;
	}
}
