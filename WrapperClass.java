package com.corejava.practice;

public class WrapperClass {

	public static void main(String[] args) {
		//String to int		
		String a ="200";
		int i =Integer.parseInt(a);
		System.out.println(i);
		
		//String to double
		String b = "10.89";
		double d =Double.parseDouble(b);
		System.out.println(d);	
		
		//String to boolean
		String c = "true";
		System.out.println(c);
		boolean v=Boolean.parseBoolean(c);
		System.out.println(v);		

	}

}
