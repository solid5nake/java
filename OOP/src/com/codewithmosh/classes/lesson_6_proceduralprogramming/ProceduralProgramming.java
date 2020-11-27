package com.codewithmosh.classes.lesson_6_proceduralprogramming;

public class ProceduralProgramming {

  public static void main(String[] args) {
    int baseSalary = 50_000;
    int extraHours = 10;
    int hourlyRate = 20;

    int wage = calculateWage(baseSalary, extraHours, hourlyRate);
    System.out.println(wage);
  }

  public static int calculateWage(
      int basesalary,
      int extraHours,
      int hourlyRate
  ) {
    return basesalary + (extraHours * hourlyRate);
  }
}

// 6- Procedural Programming
// Above is an example of procedural programming, it can become very bulky and fat of code.
// There is no use of classes with their own methods, instead we you have functions these functions are 'procedures'
// You will end up with a lot of parameters for your methods, if your methods have a lot of parameters and these get passed around a lot it's not OOP
// Hard to maintain, hard to find bugs and to refactor or fix without creating new bugs
// lack of code reusability.
// Spaghetti code, everything is connected to each other.
