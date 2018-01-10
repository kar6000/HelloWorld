package com.inharitance.concept;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();// static Polymorphism/Method overriding
		b.start();
		b.stop();
		b.reFuel();
		b.TheftSafty();

		System.out.println("*******************");
		Car c = new Car();
		c.start();
		c.stop();
		c.reFuel();
		System.out.println("*******************");

		// child class object can be referred by parent class reference variable
		Car c1 = new BMW();// Dynamic/run time Polymorphism
		c1.start();
		c1.stop();
		c1.reFuel();

		System.out.println("*******************");

		Car a = new Audi();
		a.start();
		a.stop();
		a.reFuel();

		System.out.println("*******************");

		Honda h = new Honda();
		h.start();
		h.stop();
		h.hondaAlram();
		h.reFuel();

	}

}
