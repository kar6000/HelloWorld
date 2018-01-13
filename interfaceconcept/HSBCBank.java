package com.interfaceconcept;

public class HSBCBank implements USBank, BrazilBank, CanadaBank {

	// Overridden Methods from USBank
	public void credit() {
		System.out.println("HSBC---Credit");
	}

	public void debit() {
		System.out.println("HSBC-----Debit");

	}

	public void transferMoney() {
		System.out.println("HSBC------transferMoney");

	}

	// HSBC own Methods
	public void educationLoan() {
		System.out.println("HSBC------Education loan");
	}

	public void carLoan() {
		System.out.println("HSBC----------Car loan");
	}

	// Overridden Methods Brazil Bank
	public void mutualFund() {
		System.out.println("HSBC bank-----Mutual fond");
	}

	// Overridden Methods Canada Bank
	public void safeBox() {
		System.out.println("HSBC Bank----SafeBox");

	}

	public void homeMortgage() {
		System.out.println("HSBC Bank----homeMortgage");

	}

}
