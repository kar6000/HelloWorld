package com.interfaceconcept;

public class BankOfDelhi implements USBank, CanadaBank {
	// Overridden Methods from USBank
	public void credit() {
		System.out.println("BOD---Credit");

	}

	public void debit() {
		System.out.println("BOD---debit");

	}

	public void transferMoney() {
		System.out.println("BOD---TransferMoney");

	}

	// Overridden Methods from BrazilBank
	public void safeBox() {
		System.out.println("BOD---safebox");
	}

	public void homeMortgage() {
		System.out.println("BOD--Home Mortgage");
	}

	// Bank Of Delhi own Method
	public void farmarLoan() {
		System.out.println("BOD----Farmar loan");
	}

	public void lowCosthouseloan() {
		System.out.println("BOD----Low Cost Housing Loan");
	}

}
