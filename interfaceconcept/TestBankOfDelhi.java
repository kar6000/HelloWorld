package com.interfaceconcept;

public class TestBankOfDelhi {

	public static void main(String[] args) {

		BankOfDelhi b = new BankOfDelhi();
		b.credit();
		b.debit();
		b.homeMortgage();
		b.transferMoney();
		b.safeBox();
		b.lowCosthouseloan();
		b.farmarLoan();
		System.out.println("************");

		USBank u = new BankOfDelhi();
		u.credit();
		u.debit();
		u.transferMoney();

		System.out.println("************");

		CanadaBank c = new BankOfDelhi();
		c.safeBox();
		c.homeMortgage();

	}

}
