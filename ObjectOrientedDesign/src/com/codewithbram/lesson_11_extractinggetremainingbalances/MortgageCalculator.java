package com.codewithbram.lesson_11_extractinggetremainingbalances;

public class MortgageCalculator {
  private final static byte MONTHS_IN_YEAR = 12; // static fields changed from public to private
  private final static byte PERCENT = 100; // static fields changed from public to private

  private int principal; // instance fields
  private float annualInterest;
  private byte years;

  public MortgageCalculator(int principal, float annualInterest, byte years) { // Parameterized constructor
    this.principal = principal;
    this.annualInterest = annualInterest;
    this.years = years;
  }

  public double calculateBalance(short numberOfPaymentsMade) {
    float monthlyInterest = getMonthlyInterest();
    float numberOfPayments = getNumberOfPayments();

    double balance = principal
        * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

    return balance;
  }

  public double calculateMortgage() {

    float monthlyInterest = getMonthlyInterest();
    float numberOfPayments = getNumberOfPayments();

    double mortgage = principal
        * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

    return mortgage;
  }

  public double[] getRemainingBalances() {
    var balances = new double[getNumberOfPayments()];
    for (short month = 1; month <= balances.length; month++)
      balances[month - 1] = calculateBalance(month);

    return balances;
  }

  private int getNumberOfPayments() { // implementation detail
    return years * MONTHS_IN_YEAR;
  }

  private float getMonthlyInterest() { // implementation detail
    return annualInterest / PERCENT / MONTHS_IN_YEAR;
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