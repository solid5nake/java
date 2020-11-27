package com.codewithbram.lesson_5_overloadingmethods;

import java.text.NumberFormat;

public class Main {
  final static byte MONTHS_IN_YEAR = 12;
  final static byte PERCENT = 100;

  public static void main(String[] args) {
    int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
    float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
    byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);

    printMortgage(principal, annualInterest, years);
    printPaymentSchedule(principal, annualInterest, years);
  }

  private static void printMortgage(int principal, float annualInterest, byte years) {
    double mortgage = calculateMortgage(principal, annualInterest, years);
    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
    System.out.println();
    System.out.println("MORTGAGE");
    System.out.println("--------");
    System.out.println("Monthly Payments: " + mortgageFormatted);
  }

  private static void printPaymentSchedule(int principal, float annualInterest, byte years) {
    System.out.println();
    System.out.println("PAYMENT SCHEDULE");
    System.out.println("----------------");
    for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
      double balance = calculateBalance(principal, annualInterest, years, month);
      System.out.println(NumberFormat.getCurrencyInstance().format(balance));
    }
  }

  public static double calculateBalance(
      int principal,
      float annualInterest,
      byte years,
      short numberOfPaymentsMade
  ) {
    float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
    float numberOfPayments = years * MONTHS_IN_YEAR;

    double balance = principal
        * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

    return balance;
  }

  public static double calculateMortgage(
      int principal,
      float annualInterest,
      byte years) {

    float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
    float numberOfPayments = years * MONTHS_IN_YEAR;

    double mortgage = principal
        * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

    return mortgage;
  }
}

/*
 Safe refactoring in intelij
 > CTRL + T
 > in dialogbox choose '4. move members'
 > fill in whole path, for instance in the example above "com.codewithbram.lesson_4_extractingtheconsoleclass.Console"
 > static method "readNumber" was succefully moved to new class 'Console'

 Use this safe refactor method feature from intelij instead of doing it manually

*/
