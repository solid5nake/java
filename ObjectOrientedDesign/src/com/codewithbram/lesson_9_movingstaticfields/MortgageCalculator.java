package com.codewithbram.lesson_9_movingstaticfields;

public class MortgageCalculator {
  public final static byte MONTHS_IN_YEAR = 12;
  public final static byte PERCENT = 100;

  private int principal;
  private float annualInterest;
  private byte years;

  public MortgageCalculator(int principal, float annualInterest, byte years) {
    this.principal = principal;
    this.annualInterest = annualInterest;
    this.years = years;
  }

  public double calculateBalance(short numberOfPaymentsMade) {
    float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
    float numberOfPayments = years * MONTHS_IN_YEAR;

    double balance = principal
        * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

    return balance;
  }

  public double calculateMortgage() {

    float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
    float numberOfPayments = years * MONTHS_IN_YEAR;

    double mortgage = principal
        * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

    return mortgage;
  }

  public short getYears() {
    return years;
  }
}


/*
  Encapsulation principle, storing the variables in the class, in this case; principal, annualInterest

  intelij shortcut generator to generate Constructor, Getter, Setter etc etc
  > CMD + N

  intelij change fields of the class
  > CTRL + T
  > '2. Change signature'
  > delete values which aren't needed
  > 'refactor' button

  Static methods can only see static fields of the class

  intelij CamelHops
  in intelij you can type the Capital characters to find a class in your dialogbox
 */