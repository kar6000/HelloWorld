package com.corejava.practice;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		// ArrayList contain different datatypes but it is not a good practice
		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add("ipsita");
		ar.add('S');
		ar.add(12.77);
		ar.add(true);
		System.out.println("Size of mixed datatypes arraylist is " + ar.size());

		// Define Generics
		// ArrayList with int datatype
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(10);// 0
		ar1.add(20);// 1
		ar1.add(30);// 2
		ar1.add(40);// 3
		ar1.add(50);// 4
		ar1.add(60);// 5
		System.out.println("Size of array: " + ar1.size());

		ar1.add(45);// 6
		ar1.add(46);// 7
		System.out.println("size of array after adding 2 numbers: " + ar1.size());

		ar1.remove(3);
		System.out.println("size of array after removal of one number:  " + ar1.size());
		System.out.println("The number in 3rd index is: " + ar1.get(3));

		ar1.add(3, 5);
		System.out.println("The number in 3rd index is :" + ar1.get(3));

		// Traverse/print all values of int ArrayList
		for (int i = 0; i < ar1.size(); i++) {
			System.out.println(ar1.get(i));
		}

		System.out.println("==========================");

		// ArrayList with String
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Tom");// 0
		ar2.add("James");// 1
		ar2.add("Ram");// 2
		ar2.add("Narayan");// 3
		ar2.add("Sam");// 4

		System.out.println("size of String Array list is: " + ar2.size());

		ar2.remove(2);
		System.out.println("The element in 3rd index is :" + ar2.get(2));

		// Traverse/print all values of String ArrayList
		for (int k = 0; k < ar2.size(); k++) {
			System.out.println(ar2.get(k));
		}

		System.out.println("==========================");

		// ArrayList with double
		ArrayList<Double> ar3 = new ArrayList<Double>();
		ar3.add(12.99);//0
		ar3.add(77.90);//1
		ar3.add(1.666);//2
		ar3.add(3.78);//3
		System.out.println("size of double array list: " + ar3.size());
		// Traverse/print all values of String ArrayList
		for (int d = 0; d < ar3.size(); d++) {
			System.out.println(ar3.get(d));
		}

	}

}
