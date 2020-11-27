package com.codewithbram.lesson_5_overloadingmethods;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

  public static double readNumber(String prompt) {
      return scanner.nextDouble();
  }

  public static double readNumber(String prompt, double min, double max) {
      double value;
      while (true) {
          System.out.print(prompt);
          value = scanner.nextFloat();
          if (value >= min && value <= max)
              break;
          System.out.println("Enter a value between " + min + " and " + max);
      }
      return value;
  }
}

/*
 In console applications you don't have multiple consols so it makes sense to use static methods.
 this is an example of overloading methods
*/
