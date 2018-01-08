package com.oops.concept;

public class StringConceptPractice {

	public static void main(String[] args) {
		String a = new String("Hello Universe!");
		
		System.out.println(a.length());
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		System.out.println(a.charAt(0));
		System.out.println(a.indexOf("Uni"));
		System.out.println(a.substring(6));
		System.out.println(a.substring(6, 9));
		System.out.println(a.equals("hello universe!"));
		System.out.println(a.equalsIgnoreCase("hello universe!"));
		System.out.println(a.startsWith("Hello"));
		System.out.println(a.startsWith("Uni",6));
		System.out.println(a.contains("Un"));
		System.err.println(a.replace('e', 'u'));
		
		a= " A B C \n \t \n   ";
		a.trim();
		System.out.println(a.trim());

	}

}
