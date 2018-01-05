package com.corejava.practice;

public class LocalGlobalConcept {
//Global variables
	String name = "Jack";
	int age = 20;
	char gender = 'M';

	public static void main(String[] args) {
		LocalGlobalConcept xyz = new LocalGlobalConcept();
		System.out.println(xyz.age);
		System.out.println(xyz.gender);
		System.out.println(xyz.name);		

	}
	
	public void add() {
		int i =10;
		System.out.println(age);
	}
	
	public void sub() {
		int k =20;
	}

}
