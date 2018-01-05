package com.corejava.practice;

public class StaticArrayConcept {

	public static void main(String[] args) {
		// Limitations of Array:
		// 1.Size is fixed(Static Array)-solution: Use dynamic array/arraylist/collections
		// 2. stores only similar data types-solution:Use Object Array

		// 1. int
		int i[] = new int[4];
		// int i[] = {10,20,30,40};
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[1] + i[2]);
		// System.out.println(i[4]);//ArrayIndexOutOfBoundsException
		System.out.println("Size of integer array is: " + i.length);

		// traverse/iterate/print all the values
		for (int k = 0; k < i.length; k++) {
			System.out.println(i[k]);

		}
		System.out.println("=======================================");

		// 2. double

		// double d[] = new double[3];
		double d[] = { 14.68, 26.98, 12.55 };
		d[0] = 14.88;
		d[1] = 26.98;
		d[2] = 12.55;
		System.out.println(d[0]);
		System.out.println(d[1] + d[2]);
		System.out.println("Size of double array is :" + d.length);

		System.out.println("=======================================");

		// 3. char array
		char c[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
		System.out.println(c[1]);
		System.out.println(c[2] + c[3]);
		System.out.println(c[2] + c[3] + c[4]);
		System.out.println("Size of character array is :" + c.length);
		System.out.println("=======================================");

		// 4. boolean array
		boolean b[] = { true, false };

		// String array

		String s[] = { "Apple", "banana", "grapes", "orange", "blueberry" };
		System.out.println(s[2] + s[3] + s[4]);
		System.out.println("Size of String array is :" + s.length);

		System.out.println("=======================================");
		
		//Object Array
		
		Object ob[] = {"tome",45,"Akash",26};
		
		
		

	}

}
