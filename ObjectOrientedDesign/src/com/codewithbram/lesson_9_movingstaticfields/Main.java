package com.codewithbram.lesson_9_movingstaticfields;

public class Main {

  public static void main(String[] args) {
    int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
    float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
    byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);

    var calculator = new MortgageCalculator(principal, annualInterest, years);

    var report = new MortgageReport(calculator);
    report.printMortgage();
    report.printPaymentSchedule();
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
