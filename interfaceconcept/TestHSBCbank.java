package com.interfaceconcept;

public class TestHSBCbank {

	public static void main(String[] args) {

		System.out.println(USBank.us_balance);
		System.out.println(HSBCBank.us_balance);
		System.out.println(HSBCBank.brazil_balance);

		// System.out.println(balance); //direct call not possible

		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.carLoan();
		hs.educationLoan();
		hs.transferMoney();
		hs.mutualFund();

		System.out.println("XXXXXXXXXX");

		// Dynamic Polymorphism/Up Casting
		USBank ub = new HSBCBank();
		ub.credit();
		ub.debit();
		ub.transferMoney();

		System.out.println("XXXXXXXXXX");

		// Dynamic Polymorphism
		BrazilBank b = new HSBCBank();
		b.mutualFund();

		System.out.println("XXXXXXXXXX");

		// Dynamic Polymorphism
		CanadaBank c = new HSBCBank();
		c.safeBox();
		c.homeMortgage();

	}

}
