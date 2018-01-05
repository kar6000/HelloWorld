package com.corejava.practice;

public class StaticNonStaticConcept {

	// Global variables/class variables
	String name = "Mary";
	double ID =12345;
	double salary = 20000;
	static int age = 25;

	public static void main(String[] args) {

		// 1. call non static members:
		StaticNonStaticConcept abc = new StaticNonStaticConcept();
		abc.sendMail();
		
		System.out.println(abc.name);
		System.out.println(abc.salary);
		System.out.println(abc.ID);

		abc.sum();// warning

		// 2. call static members
		// a. direct calling:
		sum();
		System.out.println(age);
		// b. call by class name:
		StaticNonStaticConcept.sum();
		StaticNonStaticConcept.multiply();

	}

	public void sendMail() {
		System.out.println("send mail method");
	}

	public static void sum() {
		System.out.println("sum method");
	}
	public static void multiply() {
		System.out.println("Multiply method");
	}

}
