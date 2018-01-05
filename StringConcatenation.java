package com.corejava.practice;

public class StringConcatenation {

	public static void main(String[] args) {
		
		int a =20;
		int b =10;
		String x ="Ipsita";
		String y ="Hello";
		
		System.out.println(a+b+x+y);//30ipsitahello
		System.out.println((a+b)+x+y);//30ipsitahello
		System.out.println(x+y+a+b);//ipsitahello2010
		System.out.println(x+y+(a+b));//ipsitahello30
		System.out.println(x+a+b+y);//ipsita1020hello
		
	}

}
