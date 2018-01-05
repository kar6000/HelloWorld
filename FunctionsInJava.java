package com.corejava.practice;

public class FunctionsInJava {

	public static void main(String[] args) {
		// call the Methods inside main
		// object of the class: new keyword

		FunctionsInJava xyz = new FunctionsInJava();
		xyz.test();
		double double_result = xyz.add(20.55, 100.88, 1877.07);
		System.out.println("Result of addition of three double number is: " + double_result);
		int div_result =xyz.div();
		System.out.println("Result of integer division is: "+div_result);
		int sum_result =xyz.sum();
		System.out.println("Result of intiger sum is: "+sum_result);
		xyz.PQR();
		System.out.println("The string name is: "+xyz.PQR());

	}

	public void test() {
		System.out.println("test method");
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("sum is:" + c);
	}

	public int div() {
		System.out.println("division method");
		int p = 30;
		int q = 10;
		int r = p / q;
		return r;
	}

	public int sum() {
		System.out.println("Sum Method");
		int a = 12;
		int b = 20;
		int c = a + b;
		return c;
	}

	public double add(double a, double b, double c) {
		System.out.println("Add method using double");
		double d = a + b + c;
		return d;

	}

	public String PQR() {
		System.out.println("Print a String");
		String s = "HPALM";
		return s;
	}

	public int multiply(int m, int n) {
		System.out.println("multiply method");
		int l = m * n;
		return l;
	}

}
