package com.corejava.practice;

public class MethodOverloadingInJava {

	public static void main(String[] args) {

		MethodOverloadingInJava obj = new MethodOverloadingInJava();
		
		obj.sum();
		obj.sum(20);
		obj.sum(2, 5);
		obj.sum(10, 20, 30);
		obj.sum(12.88, 290.67);
		obj.sum("HP", "ALM");
	}

	// functions are independent to each other or parallel to each other
	// Method overloading: within the same class, if there are number of methods,having the same method name but different parameters.

	public void sum() {
		System.out.println("Sum method with 0 parameter");

	}

	public void sum(int a) {
		System.out.println("Sum method with one int parameter");

	}

	public void sum(int a, int b) {
		System.out.println("Sum method with two int parameter");

	}

	public void sum(int a, int b, int c) {

		System.out.println("Sum method with three int parameter");

	}

	public void sum(double a, double b) {
		System.out.println("Sum Method with three double parameter");

	}

	public void sum(String a, String b) {
		System.out.println("Sum method with two String paramenter");

	}
}
