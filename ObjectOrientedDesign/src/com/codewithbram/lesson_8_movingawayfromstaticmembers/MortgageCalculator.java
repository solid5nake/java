package com.codewithbram.lesson_8_movingawayfromstaticmembers;

public class MortgageCalculator {
  private int principal;
  private float annualInterest;
  private byte years;

  public MortgageCalculator(int principal, float annualInterest, byte years) { // we have encapsulated the parameters principal, annualInterest, and years in the MortgageCalculator object
    this.principal = principal;
    this.annualInterest = annualInterest;
    this.years = years;
  }

  public double calculateBalance(short numberOfPaymentsMade) {
    float monthlyInterest = annualInterest / Main.PERCENT / Main.MONTHS_IN_YEAR;
    float numberOfPayments = years * Main.MONTHS_IN_YEAR;

    double balance = principal
        * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

    return balance;
  }

  public double calculateMortgage() {

    float monthlyInterest = annualInterest / Main.PERCENT / Main.MONTHS_IN_YEAR;
    float numberOfPayments = years * Main.MONTHS_IN_YEAR;

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
  You shouldn't be using a lot of static field and methods they are troublesome, we should only use them in a concept where we want them in a single place

  Encapsulation principle, storing the variables in the class, in this case; principal, annualInterest

  intelij shortcut generator to generate Constructor, Getter, Setter etc etc
  > CMD + N

  intelij change fields of the class
  > CTRL + T
  > '2. Change signature'
  > delete values which aren't needed
  > 'refactor' button

  Static methods can only see static fields of the class
 */