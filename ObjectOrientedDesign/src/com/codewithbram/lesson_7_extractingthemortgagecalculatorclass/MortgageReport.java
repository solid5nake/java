package com.codewithbram.lesson_7_extractingthemortgagecalculatorclass;

import java.text.NumberFormat;

public class MortgageReport {

  private static MortgageCalculator calculator;

  public static void printMortgage(int principal, float annualInterest, byte years) {
    calculator = new MortgageCalculator(principal, annualInterest, years);
    double mortgage = calculator.calculateMortgage();
    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
    System.out.println();
    System.out.println("MORTGAGE");
    System.out.println("--------");
    System.out.println("Monthly Payments: " + mortgageFormatted);
  }

  public static void printPaymentSchedule(int principal, float annualInterest, byte years) {
    System.out.println();
    System.out.println("PAYMENT SCHEDULE");
    System.out.println("----------------");
    for (short month = 1; month <= years * Main.MONTHS_IN_YEAR; month++) {
      double balance = calculator.calculateBalance(month);
      System.out.println(NumberFormat.getCurrencyInstance().format(balance));
    }
  }
}


/*
Intelij, Extract field from a local variable
> navigate the cursor to the variable
> CTRL + T (refactor this)
> choose'6. Field...' or ALT + CMD + F

*/