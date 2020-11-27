package com.codewithbram.lesson_9_movingstaticfields;

import java.text.NumberFormat;

public class MortgageReport {

  private MortgageCalculator calculator; // private static field of type MortgageCalculator class

  public MortgageReport(MortgageCalculator calculator) {
    this.calculator = calculator;
  }

  public void printPaymentSchedule() {
    System.out.println();
    System.out.println("PAYMENT SCHEDULE");
    System.out.println("----------------");
    for (short month = 1; month <= calculator.getYears() * MortgageCalculator.MONTHS_IN_YEAR; month++) {
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
Intelij, Extract field from a local variable
> navigate the cursor to the variable
> CTRL + T (refactor this)
> choose'6. Field...' or ALT + CMD + F

*/