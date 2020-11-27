package com.codewithbram.lesson_12_lasttouch;

import java.text.NumberFormat;

public class MortgageReport { // encapsulated data and methods

  private final NumberFormat currency; // stored constant variable 'currency' in the field, immutable
  private MortgageCalculator calculator; // stored calculation object in this field, private static field of type MortgageCalculator class

  public MortgageReport(MortgageCalculator calculator) {
    this.calculator = calculator;
    currency = NumberFormat.getCurrencyInstance();
  }

  public void printPaymentSchedule() {
    System.out.println();
    System.out.println("PAYMENT SCHEDULE");
    System.out.println("----------------");
    for (double balance: calculator.getRemainingBalances())
      System.out.println(currency.format(balance)); // before expression was: NumberFormat.getCurrencyInstance().format(balance));

/*
    Old implementation
    for (short month = 1; month <= calculator.getYears() * MortgageCalculator.MONTHS_IN_YEAR; month++) {
      double balance = calculator.calculateBalance(month);
      System.out.println(NumberFormat.getCurrencyInstance().format(balance));
    }
*/
  }

  public void printMortgage() {
    double mortgage = calculator.calculateMortgage();
    String mortgageFormatted = currency.format(mortgage); // before: String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
    System.out.println();
    System.out.println("MORTGAGE");
    System.out.println("--------");
    System.out.println("Monthly Payments: " + mortgageFormatted);
  }
}


/*
before this expression:

NumberFormat.getCurrencyInstance()

was duplicated on two places, so we refactored this into a field


Intelij refactor > extract field
> Go to refactor
> Go to Extract
> select Field
> select refactor
> OR
> shortcut ALT + CMD + F


Intelij, Extract field from a local variable
> navigate the cursor to the variable
> CTRL + T (refactor this)
> choose'6. Field...' or ALT + CMD + F

*/