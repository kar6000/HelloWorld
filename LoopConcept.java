package com.corejava.practice;

public class LoopConcept {

	public static void main(String[] args) {

		// while loop (Print 1 to 10)
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		System.out.println("===========================");

		// while loop (Print 10 to 1)
		int a =10;
		while(a>=1) {
			System.out.println(a);
			a--;
		}

		System.out.println("===========================");
		// for loop (print 1 to 20)
		for (int j = 1; j <= 20; j++) {
			System.out.println(j);
		}
		
		System.out.println("===========================");
		
		// for loop (print 10 to 1)
		for (int b = 10; b >=1; b--) {
			System.out.println(b);
		}

	}

}
