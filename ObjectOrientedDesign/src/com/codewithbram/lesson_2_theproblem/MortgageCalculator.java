package com.codewithbram.lesson_2_theproblem;

public class MortgageCalculator {
  private final static byte MONTHS_IN_YEAR = 12;
  private final static byte PERCENT = 100;

  private static int principal;
  private static float annualInterest;
  private static byte years;

  MortgageCalculator(int principal, float annualInterest, byte years) {
    this.principal = principal;
    this.annualInterest = annualInterest;
    this.years = years;
  }

  private static float getNumberOfPayments() {
    return years * MONTHS_IN_YEAR;
  }

  public static double calculateBalance(short numberOfPaymentsMade) {
    float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
    float numberOfPayments = MortgageCalculator.getNumberOfPayments();

    double balance = principal
        * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

    return balance;
  }

  public static double calculateMortgage(){

    float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
    float numberOfPayments = MortgageCalculator.getNumberOfPayments();

    double mortgage = principal
        * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

    return mortgage;
  }

}
