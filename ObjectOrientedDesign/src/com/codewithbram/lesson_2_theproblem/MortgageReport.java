package com.codewithbram.lesson_2_theproblem;

import java.text.NumberFormat;

public class MortgageReport {
  private final static byte MONTHS_IN_YEAR = 12;

  public void printMortgage() {
    double mortgage = MortgageCalculator.calculateMortgage();
    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
    System.out.println();
    System.out.println("MORTGAGE");
    System.out.println("--------");
    System.out.println("Monthly Payments: " + mortgageFormatted);
  }

  public void printPaymentSchedule(byte years) {
    System.out.println();
    System.out.println("PAYMENT SCHEDULE");
    System.out.println("----------------");
    for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
      double balance = MortgageCalculator.calculateBalance(month);
      System.out.println(NumberFormat.getCurrencyInstance().format(balance));
    }
  }
}
