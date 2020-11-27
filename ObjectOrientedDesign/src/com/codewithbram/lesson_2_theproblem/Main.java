package com.codewithbram.lesson_2_theproblem;

public class Main {

    public static void main(String[] args) {
        var consoleReader = new ConsoleReader();
        var mortgageReport = new MortgageReport();

        int principal = (int) consoleReader.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) consoleReader.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) consoleReader.readNumber("Period (Years): ", 1, 30);

        new MortgageCalculator(principal, annualInterest, years);

        mortgageReport.printMortgage();
        mortgageReport.printPaymentSchedule(years);
    }
}

/*
    My first attempt of refactoring the before procedural code into an OOP code in Java
    Added three additional classes:
    ConsoleReader()
    MortgageCalculator()
    MortgageReport()
*/
