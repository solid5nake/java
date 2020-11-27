package com.codewithbram.lesson_8_movingawayfromstaticmembers;

import java.text.NumberFormat;

public class MortgageReport {

  private MortgageCalculator calculator;

  public MortgageReport(MortgageCalculator calculator) { // Constructor to initialise this field  'calculator')
    this.calculator = calculator; // initialising the field through a new object
  }

  public void printPaymentSchedule() {
    System.out.println();
    System.out.println("PAYMENT SCHEDULE");
    System.out.println("----------------");
    for (short month = 1; month <= calculator.getYears() * Main.MONTHS_IN_YEAR; month++) {
      double balance = calculator.calculateBalance(month);
      System.out.println(NumberFormat.getCurrencyInstance().format(balance));
    }
  }

  public void printMortgage() {
    double mortgage = calculator.calculateMortgage();
    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
    System.out.println();
    System.out.println("MORTGAGE");
    System.out.println("--------");
    System.out.println("Monthly Payments: " + mortgageFormatted);
  }
}


/*

we have encapsulated principal annualInterest and years in the MortgageCalculator object

Intelij, Extract field from a local variable
> navigate the cursor to the variable
> CTRL + T (refactor this)
> choose'6. Field...' or ALT + CMD + F

intelij create getter shortcut
> example:
> move carrot to getYear()
> ALT + Enter (call action)
> choose from:
> Create property 'years' => intelij will create setter & getter
> Create read-only property 'years' => intelij will only create a getter
*/