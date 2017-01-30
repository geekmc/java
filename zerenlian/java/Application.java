package com.zerenlian.java;

public class Application {
		
			private Handler useInt, useLong, useBig;
			public void createChain(){
				useInt=new UseInt();
				useLong=new UseLong();
				useBig=new UseBigInteger();
				useInt.setNextHandler(useLong);
				useLong.setNextHandler(useBig);
			}
			public void responseClient(String number){
				useInt.computerMultiply(number);
			}
			public static void main(String[] args) {
				Application application=new Application();
				application.createChain();
				application.responseClient("32");
			}
}
